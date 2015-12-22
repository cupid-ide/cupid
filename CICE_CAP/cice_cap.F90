!--------------- LANL CICE NUOPC CAP -----------------
! This is the LANL CICE model cap component that's NUOPC compiant.
!
! Author:  Fei.Liu@gmail.com
!
! 5/10/13
! This is now acting as a cap/connector between NUOPC driver and LANL CICE code.
!

module cice_cap_mod

  use ice_blocks, only: nx_block, ny_block, nblocks_tot, block, get_block, &
                        get_block_parameter
  use ice_domain_size, only: max_blocks, nx_global, ny_global
  use ice_domain, only: nblocks, blocks_ice, distrb_info
  use ice_distribution, only: ice_distributiongetblockloc
  use ice_constants, only: Tffresh, rad_to_deg
  use ice_calendar,  only: dt
  use ice_flux
  use ice_grid, only: TLAT, TLON, ULAT, ULON, hm, tarea, ANGLET, ANGLE, &
                      dxt, dyt
  use ice_state
  use CICE_RunMod
  use CICE_InitMod
  use CICE_FinalMod 

  use ESMF
  use NUOPC
  use NUOPC_Model, &
    model_routine_SS      => SetServices, &
    model_label_SetClock  => label_SetClock, &
    model_label_Advance   => label_Advance, &
    model_label_Finalize  => label_Finalize

  implicit none
  private
  public SetServices

  type cice_internalstate_type
  end type

  type cice_internalstate_wrapper
    type(cice_internalstate_type), pointer :: ptr
  end type

  integer   :: import_slice = 0
  integer   :: export_slice = 0

  type fld_list_type
    character(len=64) :: stdname
    character(len=64) :: shortname
    character(len=64) :: transferOffer
    logical           :: assoc    ! is the farrayPtr associated with internal data
    real(ESMF_KIND_R8), dimension(:,:,:), pointer :: farrayPtr
  end type fld_list_type

  integer,parameter :: fldsMax = 100
  integer :: fldsToIce_num = 0
  type (fld_list_type) :: fldsToIce(fldsMax)
  integer :: fldsFrIce_num = 0
  type (fld_list_type) :: fldsFrIce(fldsMax)

  integer :: lsize    ! local number of gridcells for coupling
  character(len=256) :: tmpstr
  character(len=2048):: info
  logical :: isPresent
  integer :: dbrc     ! temporary debug rc value

  type(ESMF_Grid), save :: ice_grid_i

  contains
  !-----------------------------------------------------------------------
  !------------------- CICE code starts here -----------------------
  !-----------------------------------------------------------------------

  subroutine SetServices(gcomp, rc)

    type(ESMF_GridComp)  :: gcomp
    integer, intent(out) :: rc
    character(len=*),parameter  :: subname='(cice_cap:SetServices)'

    rc = ESMF_SUCCESS
    
    ! the NUOPC model component will register the generic methods
    call NUOPC_CompDerive(gcomp, model_routine_SS, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    ! switching to IPD versions
    call ESMF_GridCompSetEntryPoint(gcomp, ESMF_METHOD_INITIALIZE, &
      userRoutine=InitializeP0, phase=0, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    ! set entry point for methods that require specific implementation
    call NUOPC_CompSetEntryPoint(gcomp, ESMF_METHOD_INITIALIZE, &
      phaseLabelList=(/"IPDv01p1"/), userRoutine=InitializeAdvertise, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    call NUOPC_CompSetEntryPoint(gcomp, ESMF_METHOD_INITIALIZE, &
      phaseLabelList=(/"IPDv01p3"/), userRoutine=InitializeRealize, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    ! attach specializing method(s)
    ! No need to change clock settings
    call ESMF_MethodAdd(gcomp, label=model_label_SetClock, &
      userRoutine=SetClock, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    
    call ESMF_MethodAdd(gcomp, label=model_label_Advance, &
      userRoutine=ModelAdvance_slow, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    call NUOPC_CompSpecialize(gcomp, specLabel=model_label_Finalize, &
      specRoutine=cice_model_finalize, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    call CICE_FieldsSetup()

  end subroutine

  !-----------------------------------------------------------------------------

  subroutine InitializeP0(gcomp, importState, exportState, clock, rc)
    type(ESMF_GridComp)   :: gcomp
    type(ESMF_State)      :: importState, exportState
    type(ESMF_Clock)      :: clock
    integer, intent(out)  :: rc
    
    rc = ESMF_SUCCESS

    ! Switch to IPDv01 by filtering all other phaseMap entries
    call NUOPC_CompFilterPhaseMap(gcomp, ESMF_METHOD_INITIALIZE, &
      acceptStringList=(/"IPDv01p"/), rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    
  end subroutine
  
  !-----------------------------------------------------------------------------

  subroutine InitializeAdvertise(gcomp, importState, exportState, clock, rc)

    type(ESMF_GridComp)                    :: gcomp
    type(ESMF_State)                       :: importState, exportState
    type(ESMF_Clock)                       :: clock
    integer, intent(out)                   :: rc

    ! Local Variables
    type(ESMF_VM)                          :: vm
    integer                                :: mpi_comm
    character(len=*),parameter  :: subname='(cice_cap:InitializeAdvertise)'

    rc = ESMF_SUCCESS

    call ESMF_VMGetCurrent(vm, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    call ESMF_VMGet(vm, mpiCommunicator=mpi_comm, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    call CICE_Initialize(mpi_comm)

    call CICE_AdvertiseFields(importState, fldsToIce_num, fldsToIce, rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    call CICE_AdvertiseFields(exportState, fldsFrIce_num, fldsFrIce, rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    write(info,*) subname,' --- initialization phase 1 completed --- '
    call ESMF_LogWrite(info, ESMF_LOGMSG_INFO, rc=dbrc)

  end subroutine
  
  !-----------------------------------------------------------------------------

  subroutine InitializeRealize(gcomp, importState, exportState, clock, rc)
    type(ESMF_GridComp)  :: gcomp
    type(ESMF_State)     :: importState, exportState
    type(ESMF_Clock)     :: clock
    integer, intent(out) :: rc

    ! Local Variables
    type(ESMF_VM)                          :: vm
    type(ESMF_Grid)                        :: gridIn
    type(ESMF_Grid)                        :: gridOut
    type(ESMF_DistGrid)                    :: distgrid
    type(ESMF_DistGridConnection), allocatable :: connectionList(:)
    integer                                :: npet
    integer                                :: i,j,iblk, n, i1,j1, DE
    integer                                :: ilo,ihi,jlo,jhi
    integer                                :: ig,jg,cnt
    integer                                :: peID,locID
    integer, pointer                       :: indexList(:)
    integer, pointer                       :: deLabelList(:)
    integer, pointer                       :: deBlockList(:,:,:)
    integer, pointer                       :: petMap(:)
    integer, pointer                       :: i_glob(:),j_glob(:)
    integer                                :: lbnd(2),ubnd(2)
    type(block)                            :: this_block
    type(ESMF_DELayout)                    :: delayout
    real(ESMF_KIND_R8), pointer            :: tarray(:,:)     
    real(ESMF_KIND_R8), pointer :: coordXcenter(:,:)
    real(ESMF_KIND_R8), pointer :: coordYcenter(:,:)
    real(ESMF_KIND_R8), pointer :: coordXcorner(:,:)
    real(ESMF_KIND_R8), pointer :: coordYcorner(:,:)
    integer(ESMF_KIND_I4), pointer :: gridmask(:,:)
    real(ESMF_KIND_R8), pointer :: gridarea(:,:)
    character(len=*),parameter  :: subname='(cice_cap:InitializeRealize)'

    rc = ESMF_SUCCESS

    ! We can check if npet is 4 or some other value to make sure
    ! CICE is configured to run on the correct number of processors.

    ! create a Grid object for Fields
    ! we are going to create a single tile displaced pole grid from a gridspec
    ! file. We also use the exact decomposition in CICE so that the Fields
    ! created can wrap on the data pointers in internal part of CICE

    write(tmpstr,'(a,2i8)') subname//' ice nx,ny = ',nx_global,ny_global
    call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)

!    distgrid = ESMF_DistGridCreate(minIndex=(/1,1/), maxIndex=(/nx_global,ny_global/), &
!       regDecomp=(/2,2/), rc=rc)

    allocate(deBlockList(2,2,nblocks_tot))
    allocate(petMap(nblocks_tot))
    allocate(deLabelList(nblocks_tot))

    write(tmpstr,'(a,1i8)') subname//' nblocks = ',nblocks_tot
    call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)
    do n = 1, nblocks_tot
       deLabelList(n) = n
       call get_block_parameter(n,ilo=ilo,ihi=ihi,jlo=jlo,jhi=jhi, &
          i_glob=i_glob,j_glob=j_glob)
       deBlockList(1,1,n) = i_glob(ilo)
       deBlockList(1,2,n) = i_glob(ihi)
       deBlockList(2,1,n) = j_glob(jlo)
       deBlockList(2,2,n) = j_glob(jhi)
       call ice_distributionGetBlockLoc(distrb_info,n,peID,locID)
       petMap(n) = peID - 1
       write(tmpstr,'(a,2i8)') subname//' IDs  = ',n,peID
       call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)
       write(tmpstr,'(a,3i8)') subname//' iglo = ',n,deBlockList(1,1,n),deBlockList(1,2,n)
       call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)
       write(tmpstr,'(a,3i8)') subname//' jglo = ',n,deBlockList(2,1,n),deBlockList(2,2,n)
       call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)
    enddo

    delayout = ESMF_DELayoutCreate(petMap, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

    allocate(connectionList(1))
    call ESMF_DistGridConnectionSet(connectionList(1), tileIndexA=1, &
      tileIndexB=1, positionVector=(/nx_global, 0/), rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    distgrid = ESMF_DistGridCreate(minIndex=(/1,1/), maxIndex=(/nx_global,ny_global/), &
!        indexflag = ESMF_INDEX_DELOCAL, &
        deBlockList=deBlockList, &
!        deLabelList=deLabelList, &
        delayout=delayout, &
        connectionList=connectionList, &
        rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

    deallocate(deLabelList)
    deallocate(deBlockList)
    deallocate(petMap)
    deallocate(connectionList)

!    call ESMF_DistGridPrint(distgrid=distgrid, rc=rc)
!    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
!      line=__LINE__, &
!      file=__FILE__)) &
!      return  ! bail out

    call ESMF_DistGridGet(distgrid=distgrid, localDE=0, elementCount=cnt, rc=rc)
    allocate(indexList(cnt))
    write(tmpstr,'(a,i8)') subname//' distgrid cnt= ',cnt
    call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)
    call ESMF_DistGridGet(distgrid=distgrid, localDE=0, seqIndexList=indexList, rc=rc)
    write(tmpstr,'(a,4i8)') subname//' distgrid list= ',indexList(1),indexList(cnt),minval(indexList), maxval(indexList)
    call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)
    deallocate(IndexList)

!    gridIn = ESMF_GridCreate('global_gx3_gridspec.nc', ESMF_FILEFORMAT_GRIDSPEC, &
!!      (/2,2/), isSphere=.true., coordNames=(/'ulon', 'ulat'/), &
!      distgrid=distgrid, isSphere=.true., coordNames=(/'ulon', 'ulat'/), &
!      indexflag=ESMF_INDEX_DELOCAL, addCornerStagger=.true., rc=rc)
!!      indexflag=ESMF_INDEX_GLOBAL, addCornerStagger=.true., rc=rc)
!    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
!      line=__LINE__, &
!      file=__FILE__)) &
!      return  ! bail out

    gridIn = ESMF_GridCreate(distgrid=distgrid, &
       coordSys = ESMF_COORDSYS_SPH_DEG, &
       gridEdgeLWidth=(/0,0/), gridEdgeUWidth=(/0,1/), &
       rc = rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

    call ESMF_GridAddCoord(gridIn, staggerLoc=ESMF_STAGGERLOC_CENTER, rc=rc) 
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
    call ESMF_GridAddCoord(gridIn, staggerLoc=ESMF_STAGGERLOC_CORNER, rc=rc) 
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
    call ESMF_GridAddItem(gridIn, itemFlag=ESMF_GRIDITEM_MASK, itemTypeKind=ESMF_TYPEKIND_I4, &
       staggerLoc=ESMF_STAGGERLOC_CENTER, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
    call ESMF_GridAddItem(gridIn, itemFlag=ESMF_GRIDITEM_AREA, itemTypeKind=ESMF_TYPEKIND_R8, &
       staggerLoc=ESMF_STAGGERLOC_CENTER, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

    do iblk = 1,nblocks
       DE = iblk-1
       this_block = get_block(blocks_ice(iblk),iblk)
       ilo = this_block%ilo
       ihi = this_block%ihi
       jlo = this_block%jlo
       jhi = this_block%jhi

       call ESMF_GridGetCoord(gridIn, coordDim=1, localDE=DE, &
           staggerloc=ESMF_STAGGERLOC_CENTER, &
           computationalLBound=lbnd, computationalUBound=ubnd, &
           farrayPtr=coordXcenter, rc=rc)
       if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
       call ESMF_GridGetCoord(gridIn, coordDim=2, localDE=DE, &
           staggerloc=ESMF_STAGGERLOC_CENTER, &
           farrayPtr=coordYcenter, rc=rc)
       if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

       write(tmpstr,'(a,5i8)') subname//' iblk center bnds ',iblk,lbnd,ubnd
       call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)
       if (lbnd(1) /= 1 .or. lbnd(2) /= 1 .or. ubnd(1) /= ihi-ilo+1 .or. ubnd(2) /= jhi-jlo+1) then
          write(tmpstr,'(a,5i8)') subname//' iblk bnds ERROR '
          call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, line=__LINE__, file=__FILE__, rc=dbrc)
          rc = ESMF_FAILURE
          return
       endif

       call ESMF_GridGetItem(gridIn, itemflag=ESMF_GRIDITEM_MASK, localDE=DE, &
           staggerloc=ESMF_STAGGERLOC_CENTER, &
           farrayPtr=gridmask, rc=rc)
       if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
       call ESMF_GridGetItem(gridIn, itemflag=ESMF_GRIDITEM_AREA, localDE=DE, &
           staggerloc=ESMF_STAGGERLOC_CENTER, &
           farrayPtr=gridarea, rc=rc)
       if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

       do j1 = lbnd(2),ubnd(2)
       do i1 = lbnd(1),ubnd(1)
          i = i1 + ilo - lbnd(1)
          j = j1 + jlo - lbnd(2)
          coordXcenter(i1,j1) = TLON(i,j,iblk) * rad_to_deg
          coordYcenter(i1,j1) = TLAT(i,j,iblk) * rad_to_deg
          gridmask(i1,j1) = nint(hm(i,j,iblk))
          gridarea(i1,j1) = tarea(i,j,iblk)
       enddo
       enddo

       call ESMF_GridGetCoord(gridIn, coordDim=1, localDE=DE, &
           staggerloc=ESMF_STAGGERLOC_CORNER, &
           computationalLBound=lbnd, computationalUBound=ubnd, &
           farrayPtr=coordXcorner, rc=rc)
       if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
       call ESMF_GridGetCoord(gridIn, coordDim=2, localDE=DE, &
           staggerloc=ESMF_STAGGERLOC_CORNER, &
           farrayPtr=coordYcorner, rc=rc)
       if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

       write(tmpstr,'(a,5i8)') subname//' iblk corner bnds ',iblk,lbnd,ubnd
       call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)

       ! ULON and ULAT are upper right hand corner from TLON and TLAT
       ! corners in ESMF need to be defined lon lower left corner from center
       ! ULON and ULAT have ghost cells, leverage that to fill corner arrays
       do j1 = lbnd(2),ubnd(2)
       do i1 = lbnd(1),ubnd(1)
          i = i1 + ilo - lbnd(1)
          j = j1 + jlo - lbnd(2)
          coordXcorner(i1,j1) = ULON(i-1,j-1,iblk) * rad_to_deg
          coordYcorner(i1,j1) = ULAT(i-1,j-1,iblk) * rad_to_deg
       enddo
       enddo

    enddo

    call ESMF_GridGetCoord(gridIn, coordDim=1, localDE=0,  &
       staggerLoc=ESMF_STAGGERLOC_CENTER, farrayPtr=tarray, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    write(tmpstr,'(a,2g15.7)') subname//' gridIn center1 = ',minval(tarray),maxval(tarray)
    call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)

    call ESMF_GridGetCoord(gridIn, coordDim=2, localDE=0,  &
       staggerLoc=ESMF_STAGGERLOC_CENTER, farrayPtr=tarray, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    write(tmpstr,'(a,2g15.7)') subname//' gridIn center2 = ',minval(tarray),maxval(tarray)
    call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)

    call ESMF_GridGetCoord(gridIn, coordDim=1, localDE=0,  &
       staggerLoc=ESMF_STAGGERLOC_CORNER, farrayPtr=tarray, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    write(tmpstr,'(a,2g15.7)') subname//' gridIn corner1 = ',minval(tarray),maxval(tarray)
    call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)

    call ESMF_GridGetCoord(gridIn, coordDim=2, localDE=0,  &
       staggerLoc=ESMF_STAGGERLOC_CORNER, farrayPtr=tarray, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    write(tmpstr,'(a,2g15.7)') subname//' gridIn corner2 = ',minval(tarray),maxval(tarray)
    call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)

    gridOut = gridIn ! for now out same as in
    ice_grid_i = gridIn

    call CICE_RealizeFields(importState, gridIn , fldsToIce_num, fldsToIce, "Ice import", rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    call CICE_RealizeFields(exportState, gridOut, fldsFrIce_num, fldsFrIce, "Ice export", rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

! Have to be careful with reset since states are pointing directly into cice arrays
!    call state_reset(ImportState, value=-99._ESMF_KIND_R8, rc=rc)
!    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
!      line=__LINE__, &
!      file=__FILE__)) &
!      return  ! bail out
    call state_reset(ExportState, value=-99._ESMF_KIND_R8, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

!    call State_getFldPtr(exportState,'ifrac'    ,dataPtr_ifrac,rc=rc)
!    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
!    call State_getFldPtr(exportState,'sit'      ,dataPtr_itemp,rc=rc)
!    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
!    dataPtr_ifrac = -99._ESMF_KIND_R8
!    dataPtr_itemp = -99._ESMF_KIND_R8

    write(info,*) subname,' --- initialization phase 2 completed --- '
    call ESMF_LogWrite(info, ESMF_LOGMSG_INFO, line=__LINE__, file=__FILE__, rc=dbrc)

  end subroutine
  
  !-----------------------------------------------------------------------------

  ! CICE model uses same clock as parent gridComp
  subroutine SetClock(gcomp, rc)
    type(ESMF_GridComp)  :: gcomp
    integer, intent(out) :: rc
    
    ! local variables
    type(ESMF_Clock)              :: clock
    type(ESMF_TimeInterval)       :: stabilityTimeStep, timestep
    character(len=*),parameter  :: subname='(cice_cap:SetClock)'

    rc = ESMF_SUCCESS
    
    ! query the Component for its clock, importState and exportState
    call ESMF_GridCompGet(gcomp, clock=clock, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    ! tcraig: dt is the cice thermodynamic timestep in seconds
    call ESMF_TimeIntervalSet(timestep, s=nint(dt), rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    call ESMF_ClockSet(clock, timestep=timestep, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
      
    ! initialize internal clock
    ! here: parent Clock and stability timeStep determine actual model timeStep
    call ESMF_TimeIntervalSet(stabilityTimeStep, s=nint(dt), rc=rc) 
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    call NUOPC_CompSetClock(gcomp, clock, stabilityTimeStep, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    
  end subroutine

  !-----------------------------------------------------------------------------

  subroutine ModelAdvance_slow(gcomp, rc)
    type(ESMF_GridComp)                    :: gcomp
    integer, intent(out)                   :: rc
    
    ! local variables
    type(ESMF_Clock)                       :: clock
    type(ESMF_State)                       :: importState, exportState
    type(ESMF_Time)                        :: currTime
    type(ESMF_TimeInterval)                :: timeStep
    type(ESMF_Field)                       :: lfield,lfield2d
    type(ESMF_Grid)                        :: grid
    real(ESMF_KIND_R8), pointer            :: fldptr(:,:,:)
    real(ESMF_KIND_R8), pointer            :: fldptr2d(:,:)
    type(block)                            :: this_block
    character(len=64)                      :: fldname
    integer                                :: i,j,iblk,n,i1,i2,j1,j2
    integer                                :: ilo,ihi,jlo,jhi
    real(ESMF_KIND_R8)                     :: ue, vn, ui, vj
    real(ESMF_KIND_R8)                     :: sigma_r, sigma_l, sigma_c
    type(ESMF_StateItem_Flag)              :: itemType
    ! imports
    real(ESMF_KIND_R8), pointer :: dataPtr_mdlwfx(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_swvr(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_swvf(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_swir(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_swif(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_lprec(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_fprec(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_sst(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_sss(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_sl(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_sssz(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_sssm(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_ocncz(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_ocncm(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_fmpot(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_mld(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_mzmf(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_mmmf(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_rhoabot(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_Tbot(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_pbot(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_qbot(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_zlvl(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_ubot(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_vbot(:,:,:)
    ! exports
    real(ESMF_KIND_R8), pointer :: dataPtr_mask(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_ifrac(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_itemp(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_alvdr(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_alidr(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_alvdf(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_alidf(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_strairxT(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_strairyT(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_strocnxT(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_strocnyT(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_fswthru(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_fswthruvdr(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_fswthruvdf(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_fswthruidr(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_fswthruidf(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_flwout(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_fsens(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_flat(:,:,:)
    real(ESMF_KIND_R8), pointer :: dataPtr_evap(:,:,:)
    character(len=*),parameter  :: subname='(cice_cap:ModelAdvance_slow)'

    rc = ESMF_SUCCESS
    write(info,*) subname,' --- run phase 1 called --- '
    call ESMF_LogWrite(info, ESMF_LOGMSG_INFO, rc=dbrc)
    
    ! query the Component for its clock, importState and exportState
    call ESMF_GridCompGet(gcomp, clock=clock, importState=importState, &
      exportState=exportState, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    ! HERE THE MODEL ADVANCES: currTime -> currTime + timeStep
    
    ! Because of the way that the internal Clock was set in SetClock(),
    ! its timeStep is likely smaller than the parent timeStep. As a consequence
    ! the time interval covered by a single parent timeStep will result in 
    ! multiple calls to the ModelAdvance() routine. Every time the currTime
    ! will come in by one internal timeStep advanced. This goes until the
    ! stopTime of the internal Clock has been reached.
    
    call ESMF_ClockPrint(clock, options="currTime", &
      preString="------>Advancing CICE from: ", rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    
    call ESMF_ClockGet(clock, currTime=currTime, timeStep=timeStep, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    
    call ESMF_TimePrint(currTime + timeStep, &
      preString="--------------------------------> to: ", rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    call state_diagnose(importState, 'cice_import', rc)

    import_slice = import_slice + 1

#if (1 == 0)
!tcx causes core dumps and garbage
    call NUOPC_StateWrite(importState, filePrefix='field_ice_import_', &
      timeslice=import_slice, relaxedFlag=.true., rc=rc) 
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

#else
    do i = 1,fldsToice_num
      fldname = fldsToice(i)%shortname
      call ESMF_StateGet(importState, itemName=trim(fldname), itemType=itemType, rc=rc)
      if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out
      if (itemType /= ESMF_STATEITEM_NOTFOUND) then
        call ESMF_StateGet(importState, itemName=trim(fldname), field=lfield, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
        call ESMF_FieldGet(lfield,grid=grid,rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

        ! create a copy of the 3d data in lfield but in a 2d array, lfield2d
        lfield2d = ESMF_FieldCreate(grid, ESMF_TYPEKIND_R8, indexflag=ESMF_INDEX_DELOCAL, &
          name=trim(fldname), rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
          line=__LINE__, &
          file=__FILE__)) &
          return  ! bail out

        call ESMF_FieldGet(lfield  , farrayPtr=fldptr  , rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
        call ESMF_FieldGet(lfield2d, farrayPtr=fldptr2d, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

        fldptr2d(:,:) = fldptr(:,:,1)

! causes core dumps and garbage
!        call NUOPC_FieldWrite(lfield, file='fieldN3d_ice_import_'//trim(fldname)//'.nc', &
!          timeslice=import_slice, relaxedFlag=.true., rc=rc) 
!        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
!          line=__LINE__, &
!          file=__FILE__)) &
!          return  ! bail out

! causes run time error in usage
!        call NUOPC_FieldWrite(lfield2d, file='fieldN_ice_import_'//trim(fldname)//'.nc', &
!          timeslice=import_slice, relaxedFlag=.true., rc=rc) 
!        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
!          line=__LINE__, &
!          file=__FILE__)) &
!          return  ! bail out

! causes core dumps and garbage
!        call ESMF_FieldPrint(lfield,rc=rc)
!        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
!          line=__LINE__, &
!          file=__FILE__)) &
!          return  ! bail out
!        call ESMF_FieldWrite(lfield, file='field3d_ice_import_'//trim(fldname)//'.nc', &
!          timeslice=import_slice, rc=rc) 
!        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
!          line=__LINE__, &
!          file=__FILE__)) &
!          return  ! bail out

        call ESMF_FieldWrite(lfield2d, filename='field_ice_import_'//trim(fldname)//'.nc', &
          timeslice=import_slice, rc=rc) 
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
          line=__LINE__, &
          file=__FILE__)) &
          return  ! bail out

        call ESMF_FieldDestroy(lfield2d, noGarbage=.true., rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
          line=__LINE__, &
          file=__FILE__)) &
          return  ! bail out
      endif
    enddo
#endif

    call State_getFldPtr(importState,'inst_temp_height_lowest',dataPtr_Tbot,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'inst_spec_humid_height_lowest',dataPtr_qbot,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'inst_zonal_wind_height_lowest',dataPtr_ubot,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'inst_merid_wind_height_lowest',dataPtr_vbot,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'inst_pres_height_lowest',dataPtr_pbot,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'mean_down_lw_flx',dataPtr_mdlwfx,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'mean_down_sw_vis_dir_flx',dataPtr_swvr,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'mean_down_sw_vis_dif_flx',dataPtr_swvf,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'mean_down_sw_ir_dir_flx',dataPtr_swir,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'mean_down_sw_ir_dif_flx',dataPtr_swif,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'mean_prec_rate',dataPtr_lprec,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'mean_fprec_rate',dataPtr_fprec,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'sea_surface_temperature',dataPtr_sst,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'s_surf',dataPtr_sss,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'sea_lev',dataPtr_sl,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'sea_surface_slope_zonal',dataPtr_sssz,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'sea_surface_slope_merid',dataPtr_sssm,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'ocn_current_zonal',dataPtr_ocncz,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'ocn_current_merid',dataPtr_ocncm,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'freezing_melting_potential',dataPtr_fmpot,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'mixed_layer_depth',dataPtr_mld,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'mean_zonal_moment_flx',dataPtr_mzmf,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'mean_merid_moment_flx',dataPtr_mmmf,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'inst_height_lowest',dataPtr_zlvl,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(importState,'air_density_height_lowest',dataPtr_rhoabot,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return

    do iblk = 1,nblocks
       this_block = get_block(blocks_ice(iblk),iblk)
       ilo = this_block%ilo
       ihi = this_block%ihi
       jlo = this_block%jlo
       jhi = this_block%jhi
       do j = jlo,jhi
       do i = ilo,ihi
          i1 = i - ilo + 1
          j1 = j - jlo + 1
          !rhoa   (i,j,iblk) = dataPtr_ips(i1,j1,iblk)/(287.058*(1+0.608*dataPtr_ishh2m (i1,j1,iblk))*dataPtr_ith2m  (i1,j1,iblk))
          rhoa   (i,j,iblk) = dataPtr_rhoabot(i1,j1,iblk)  ! import directly from mediator  
          potT   (i,j,iblk) = dataPtr_Tbot   (i1,j1,iblk) * (100000./dataPtr_pbot(i1,j1,iblk))**0.286 ! Potential temperature (K)
          Tair   (i,j,iblk) = dataPtr_Tbot   (i1,j1,iblk)  ! near surface temp, maybe lowest level (K)
          Qa     (i,j,iblk) = dataPtr_qbot   (i1,j1,iblk)  ! near surface humidity, maybe lowest level (kg/kg)
          zlvl   (i,j,iblk) = dataPtr_zlvl   (i1,j1,iblk)  ! height of the lowest level (m) 
          flw    (i,j,iblk) = dataPtr_mdlwfx (i1,j1,iblk)  ! downwelling longwave flux
          swvdr  (i,j,iblk) = dataPtr_swvr   (i1,j1,iblk)  ! downwelling shortwave flux, vis dir
          swvdf  (i,j,iblk) = dataPtr_swvf   (i1,j1,iblk)  ! downwelling shortwave flux, vis dif
          swidr  (i,j,iblk) = dataPtr_swir   (i1,j1,iblk)  ! downwelling shortwave flux, nir dir
          swidf  (i,j,iblk) = dataPtr_swif   (i1,j1,iblk)  ! downwelling shortwave flux, nir dif
          fsw(i,j,iblk) = swvdr(i,j,iblk)+swvdf(i,j,iblk)+swidr(i,j,iblk)+swidf(i,j,iblk)
          frain  (i,j,iblk) = dataPtr_lprec  (i1,j1,iblk)  ! flux of rain (liquid only)
!          fsnow??(i,j,iblk) = dataPtr_fprec  (i1,j1,iblk)  ! flux of frozen precip ! fprec is all junk values from med, no src
!          sss    (i,j,iblk) = dataPtr_sss    (i1,j1,iblk)  ! sea surface salinity (maybe for mushy layer)
! availability of ocean heat content (or freezing potential, use all if freezing) ! can potentially connect but contains junk from med, no src
          sst    (i,j,iblk) = dataPtr_sst    (i1,j1,iblk) - 273.15  ! sea surface temp (may not be needed?)
!!    Ice%bheat : bottom heat conducted up from ocean due to temperaure difference between sst and melting ice
!!    real    :: kmelt          = 6e-5*4e6   ! ocean/ice heat flux constant
!!    real, public, parameter :: TFREEZE = 273.16 
!!    real, parameter :: MU_TS = 0.054     ! relates freezing temp. to salinity
!          frzmlt (i,j,iblk) = -6e-5*4e6*(sst (i,j,iblk) + 0.054*dataPtr_sss(i1,j1,iblk))
!          if(dataPtr_fmpot  (i1,j1,iblk) .gt. 0) frzmlt (i,j,iblk) = dataPtr_fmpot  (i1,j1,iblk)/dt  
! Fei, Let MOM5 take care of frazil calculation 10/5/15 (import dataPtr_fmpot in W/m^2)
          frzmlt (i,j,iblk) = dataPtr_fmpot  (i1,j1,iblk)
!          hmix   (i,j,iblk) = dataPtr_mld    (i1,j1,iblk)  ! ocean mixed layer depth (may not be needed?)
!          ! --- rotate these vectors from east/north to i/j ---
          !ue = dataPtr_mzmf(i1,j1,iblk)
          !vn = dataPtr_mmmf(i1,j1,iblk)
          !strax  (i,j,iblk) = -(ue*cos(ANGLET(i,j,iblk)) + vn*sin(ANGLET(i,j,iblk)))  ! lowest level wind stress or momentum flux (Pa)
          !stray  (i,j,iblk) = -(ue*cos(ANGLET(i,j,iblk)) - vn*sin(ANGLET(i,j,iblk)))  ! lowest level wind stress or momentum flux (Pa)
          ue = dataPtr_ocncz  (i1,j1,iblk)
          vn = dataPtr_ocncm  (i1,j1,iblk)
          uocn   (i,j,iblk) = ue*cos(ANGLET(i,j,iblk)) + vn*sin(ANGLET(i,j,iblk))  ! ocean current
          vocn   (i,j,iblk) = ue*cos(ANGLET(i,j,iblk)) - vn*sin(ANGLET(i,j,iblk))  ! ocean current
          ue = dataPtr_ubot  (i1,j1,iblk)
          vn = dataPtr_vbot  (i1,j1,iblk)
          uatm   (i,j,iblk) = ue*cos(ANGLET(i,j,iblk)) + vn*sin(ANGLET(i,j,iblk))  ! wind u component
          vatm   (i,j,iblk) = ue*cos(ANGLET(i,j,iblk)) - vn*sin(ANGLET(i,j,iblk))  ! wind v component
          wind   (i,j,iblk) = sqrt(dataPtr_ubot  (i1,j1,iblk)**2 + dataPtr_vbot  (i1,j1,iblk)**2)     ! wind speed

          ! zonal sea surface slope
          sigma_r = 0.5*(dataPtr_sl(i1+1,j1+1,iblk)-dataPtr_sl(i1,j1+1,iblk)+ dataPtr_sl(i1+1,j1,iblk)-dataPtr_sl(i1,j1,iblk))/dxt(i,j,iblk)
          sigma_l = 0.5*(dataPtr_sl(i1,j1+1,iblk)-dataPtr_sl(i1-1,j1+1,iblk)+ dataPtr_sl(i1,j1,iblk)-dataPtr_sl(i1-1,j1,iblk))/dxt(i,j,iblk)
          sigma_c = 0.5*(sigma_r+sigma_l)
          if ( (sigma_r * sigma_l) .GT. 0.0 ) then
            ss_tltx(i,j,iblk) = sign ( min( 2.*min(abs(sigma_l),abs(sigma_r)), abs(sigma_c) ), sigma_c )
          else
            ss_tltx(i,j,iblk) = 0.0
          endif
          ! meridional sea surface slope
          sigma_r = 0.5*(dataPtr_sl(i1+1,j1+1,iblk)-dataPtr_sl(i1+1,j1,iblk)+ dataPtr_sl(i1,j1+1,iblk)-dataPtr_sl(i1,j1,iblk))/dyt(i,j,iblk)
          sigma_l = 0.5*(dataPtr_sl(i1+1,j1,iblk)-dataPtr_sl(i1+1,j1-1,iblk)+ dataPtr_sl(i1,j1,iblk)-dataPtr_sl(i1,j1-1,iblk))/dyt(i,j,iblk)
          sigma_c = 0.5*(sigma_r+sigma_l)
          if ( (sigma_r * sigma_l) .GT. 0.0 ) then
            ss_tlty(i,j,iblk) = sign ( min( 2.*min(abs(sigma_l),abs(sigma_r)), abs(sigma_c) ), sigma_c )
          else
            ss_tlty(i,j,iblk) = 0.0
          endif
          ! rotate onto local basis vectors
          ue = ss_tltx   (i,j,iblk)
          vn = ss_tlty   (i,j,iblk)
          ss_tltx(i,j,iblk) = ue*cos(ANGLET(i,j,iblk)) + vn*sin(ANGLET(i,j,iblk))
          ss_tlty(i,j,iblk) = ue*cos(ANGLET(i,j,iblk)) - vn*sin(ANGLET(i,j,iblk))

       enddo
       enddo
    enddo

    write(info,*) subname,' --- run phase 2 called --- '
    call ESMF_LogWrite(info, ESMF_LOGMSG_INFO, rc=dbrc)
    call CICE_Run
    write(info,*) subname,' --- run phase 3 called --- '
    call ESMF_LogWrite(info, ESMF_LOGMSG_INFO, rc=dbrc)

    !---- local modifications to coupling fields -----

    call State_getFldPtr(exportState,'ice_mask',dataPtr_mask,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'ice_fraction',dataPtr_ifrac,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'sea_ice_temperature',dataPtr_itemp,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'inst_ice_vis_dir_albedo',dataPtr_alvdr,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'inst_ice_vis_dif_albedo',dataPtr_alvdf,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'inst_ice_ir_dir_albedo',dataPtr_alidr,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'inst_ice_ir_dif_albedo',dataPtr_alidf,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'stress_on_air_ice_zonal',dataPtr_strairxT,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'stress_on_air_ice_merid',dataPtr_strairyT,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'stress_on_ocn_ice_zonal',dataPtr_strocnxT,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'stress_on_ocn_ice_merid',dataPtr_strocnyT,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'mean_sw_pen_to_ocn',dataPtr_fswthru,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'mean_net_sw_vis_dir_flx',dataPtr_fswthruvdr,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'mean_net_sw_vis_dif_flx',dataPtr_fswthruvdf,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'mean_net_sw_ir_dir_flx',dataPtr_fswthruidr,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'mean_net_sw_ir_dif_flx',dataPtr_fswthruidf,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'mean_up_lw_flx_ice',dataPtr_flwout,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'mean_sensi_heat_flx_atm_into_ice',dataPtr_fsens,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'mean_laten_heat_flx_atm_into_ice',dataPtr_flat,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return
    call State_getFldPtr(exportState,'mean_evap_rate_atm_into_ice',dataPtr_evap,rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU,line=__LINE__,file=__FILE__)) return

    write(info, *) subname//' ifrac size :', &
      lbound(dataPtr_ifrac,1), ubound(dataPtr_ifrac,1), &
      lbound(dataPtr_ifrac,2), ubound(dataPtr_ifrac,2), &
      lbound(dataPtr_ifrac,3), ubound(dataPtr_ifrac,3)
    call ESMF_LogWrite(info, ESMF_LOGMSG_INFO, rc=dbrc)

    dataPtr_ifrac = 0._ESMF_KIND_R8
    dataPtr_itemp = 0._ESMF_KIND_R8
    dataPtr_mask = 0._ESMF_KIND_R8
    do iblk = 1,nblocks
       this_block = get_block(blocks_ice(iblk),iblk)
       ilo = this_block%ilo
       ihi = this_block%ihi
       jlo = this_block%jlo
       jhi = this_block%jhi
       do j = jlo,jhi
       do i = ilo,ihi
          i1 = i - ilo + 1
          j1 = j - jlo + 1
          if (hm(i,j,iblk) > 0.5) dataPtr_mask(i1,j1,iblk) = 1._ESMF_KIND_R8
          dataPtr_ifrac   (i1,j1,iblk) = aice(i,j,iblk)   ! ice fraction (0-1)
          dataPtr_itemp   (i1,j1,iblk) = Tffresh + trcr(i,j,1,iblk)  ! surface temperature of ice covered portion (degK)
          dataPtr_alvdr   (i1,j1,iblk) = alvdr(i,j,iblk)  ! albedo vis dir
          dataPtr_alidr   (i1,j1,iblk) = alidr(i,j,iblk)  ! albedo nir dir
          dataPtr_alvdf   (i1,j1,iblk) = alvdf(i,j,iblk)  ! albedo vis dif
          dataPtr_alidf   (i1,j1,iblk) = alidf(i,j,iblk)  ! albedo nir dif
          dataPtr_fswthru (i1,j1,iblk) = fswthru(i,j,iblk) ! flux of shortwave through ice to ocean
          dataPtr_fswthruvdr (i1,j1,iblk) = fswthruvdr(i,j,iblk) ! flux of vis dir shortwave through ice to ocean
          dataPtr_fswthruvdf (i1,j1,iblk) = fswthruvdf(i,j,iblk) ! flux of vis dif shortwave through ice to ocean
          dataPtr_fswthruidr (i1,j1,iblk) = fswthruidr(i,j,iblk) ! flux of ir dir shortwave through ice to ocean
          dataPtr_fswthruidf (i1,j1,iblk) = fswthruidf(i,j,iblk) ! flux of ir dif shortwave through ice to ocean
! could change this to be total gridcell fluxes including the ocean, this would imply atm-ocean
!   fluxes are computed here.  requires some minor changes in cice to do that.
!   turn on slab ocean coupling.
! important scientifically to compute surface heat fluxes in ocean and ice separately and even in each ice category separately.
! fluxes might be weighted by ice fraction already, need to check.
! need meltwater sent to the ocean?
! need heat potential taken up from the ocean?  related to frzmlt.  (always = if freezing, <= if melting)
          dataPtr_flwout  (i1,j1,iblk) = flwout(i,j,iblk) ! longwave outgoing (upward), average over ice fraction only
          dataPtr_fsens   (i1,j1,iblk) = fsens(i,j,iblk)  ! sensible
          dataPtr_flat    (i1,j1,iblk) = flat(i,j,iblk)   ! latent
          dataPtr_evap    (i1,j1,iblk) = evap(i,j,iblk)   ! evaporation (not ~latent, need separate field)
          ! --- rotate these vectors from i/j to east/north ---
          ui = strairxT(i,j,iblk)
          vj = strairyT(i,j,iblk)
          dataPtr_strairxT(i1,j1,iblk) = ui*cos(ANGLET(i,j,iblk)) - vj*sin(ANGLET(i,j,iblk))  ! air ice stress
          dataPtr_strairyT(i1,j1,iblk) = ui*cos(ANGLET(i,j,iblk)) + vj*sin(ANGLET(i,j,iblk))  ! air ice stress
          ui = strocnxT(i,j,iblk)
          vj = strocnyT(i,j,iblk)
          dataPtr_strocnxT(i1,j1,iblk) = ui*cos(ANGLET(i,j,iblk)) - vj*sin(ANGLET(i,j,iblk))  ! ice ocean stress
          dataPtr_strocnyT(i1,j1,iblk) = ui*cos(ANGLET(i,j,iblk)) + vj*sin(ANGLET(i,j,iblk))  ! ice ocean stress
!!          write(tmpstr,'(a,3i6,2x,g17.7)') subname//' aice = ',i,j,iblk,dataPtr_ifrac(i,j,iblk)
!!          call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)
       enddo
       enddo
    enddo

    write(tmpstr,*) subname//' mask = ',minval(dataPtr_mask),maxval(dataPtr_mask)
    call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)

    !-------------------------------------------------

    call state_diagnose(exportState, 'cice_export', rc)

    export_slice = export_slice + 1

#if (1 == 0)
!tcx causes core dumps and garbage
    call NUOPC_StateWrite(exportState, filePrefix='field_ice_export_', &
      timeslice=export_slice, relaxedFlag=.true., rc=rc) 
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

#else
    do i = 1,fldsFrIce_num
      fldname = fldsFrIce(i)%shortname
      call ESMF_StateGet(exportState, itemName=trim(fldname), itemType=itemType, rc=rc)
      if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out
      if (itemType /= ESMF_STATEITEM_NOTFOUND) then
        call ESMF_StateGet(exportState, itemName=trim(fldname), field=lfield, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
        call ESMF_FieldGet(lfield,grid=grid,rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

        ! create a copy of the 3d data in lfield but in a 2d array, lfield2d
        lfield2d = ESMF_FieldCreate(grid, ESMF_TYPEKIND_R8, indexflag=ESMF_INDEX_DELOCAL, &
          name=trim(fldname), rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
          line=__LINE__, &
          file=__FILE__)) &
          return  ! bail out

        call ESMF_FieldGet(lfield  , farrayPtr=fldptr  , rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
        call ESMF_FieldGet(lfield2d, farrayPtr=fldptr2d, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

        fldptr2d(:,:) = fldptr(:,:,1)

! causes core dumps and garbage
!        call NUOPC_FieldWrite(lfield, file='field_ice_export_'//trim(fldname)//'.nc', &
!          timeslice=export_slice, relaxedFlag=.true., rc=rc) 
!        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
!          line=__LINE__, &
!          file=__FILE__)) &
!          return  ! bail out

        call ESMF_FieldWrite(lfield2d, filename='field_ice_export_'//trim(fldname)//'.nc', &
          timeslice=export_slice, rc=rc) 
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
          line=__LINE__, &
          file=__FILE__)) &
          return  ! bail out

        call ESMF_FieldDestroy(lfield2d, noGarbage=.true., rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
          line=__LINE__, &
          file=__FILE__)) &
          return  ! bail out
      endif
    enddo
#endif

    write(info,*) subname,' --- run phase 4 called --- ',rc
    call ESMF_LogWrite(info, ESMF_LOGMSG_INFO, rc=dbrc)

! Dump out all the cice internal fields to cross-examine with those connected with mediator
! This will help to determine roughly which fields can be hooked into cice

   call dumpCICEInternal(ice_grid_i, import_slice, "inst_zonal_wind_height10m", "will provide", strax)
   call dumpCICEInternal(ice_grid_i, import_slice, "inst_merid_wind_height10m", "will provide", stray)
   call dumpCICEInternal(ice_grid_i, import_slice, "inst_pres_height_surface" , "will provide", zlvl)
   call dumpCICEInternal(ice_grid_i, import_slice, "xx_pot_air_temp"          , "will provide", potT)
   call dumpCICEInternal(ice_grid_i, import_slice, "inst_temp_height2m"       , "will provide", Tair)
   call dumpCICEInternal(ice_grid_i, import_slice, "inst_spec_humid_height2m" , "will provide", Qa)
   call dumpCICEInternal(ice_grid_i, import_slice, "xx_inst_air_density"      , "will provide", rhoa)
   call dumpCICEInternal(ice_grid_i, import_slice, "mean_down_sw_vis_dir_flx" , "will provide", swvdr)
   call dumpCICEInternal(ice_grid_i, import_slice, "mean_down_sw_vis_dif_flx" , "will provide", swvdf)
   call dumpCICEInternal(ice_grid_i, import_slice, "mean_down_sw_ir_dir_flx", "will provide", swidr)
   call dumpCICEInternal(ice_grid_i, import_slice, "mean_down_sw_ir_dif_flx", "will provide", swidf)
   call dumpCICEInternal(ice_grid_i, import_slice, "mean_down_lw_flx", "will provide", flw)
   call dumpCICEInternal(ice_grid_i, import_slice, "mean_prec_rate", "will provide", frain)
   call dumpCICEInternal(ice_grid_i, import_slice, "xx_mean_fprec_rate", "will provide", frain)
   call dumpCICEInternal(ice_grid_i, import_slice, "ocn_current_zonal", "will provide", uocn)
   call dumpCICEInternal(ice_grid_i, import_slice, "ocn_current_merid", "will provide", vocn)
   call dumpCICEInternal(ice_grid_i, import_slice, "sea_surface_slope_zonal", "will provide", ss_tltx)
   call dumpCICEInternal(ice_grid_i, import_slice, "sea_surface_slope_merid", "will provide", ss_tlty)
   call dumpCICEInternal(ice_grid_i, import_slice, "s_surf", "will provide", sss)
   call dumpCICEInternal(ice_grid_i, import_slice, "sea_surface_slope_zonal", "will provide", ss_tltx)
   call dumpCICEInternal(ice_grid_i, import_slice, "sea_surface_slope_merid", "will provide", ss_tlty)
   call dumpCICEInternal(ice_grid_i, import_slice, "sea_surface_temperature", "will provide", sst)
   call dumpCICEInternal(ice_grid_i, import_slice, "freezing_melting_potential", "will provide", frzmlt)
   call dumpCICEInternal(ice_grid_i, import_slice, "xx_inst_frz_mlt_potential", "will provide", frzmlt_init)
   call dumpCICEInternal(ice_grid_i, import_slice, "freezing_temp", "will provide", Tf)
   call dumpCICEInternal(ice_grid_i, import_slice, "mean_deep_ocean_down_heat_flx", "will provide", qdp)
   call dumpCICEInternal(ice_grid_i, import_slice, "mixed_layer_depth", "will provide", hmix)
   call dumpCICEInternal(ice_grid_i, import_slice, "xx_daice_da", "will provide", daice_da)

!--------- export fields from Sea Ice -------------

   call dumpCICEInternal(ice_grid_i, export_slice, "inst_ice_vis_dir_albedo"         , "will provide", alvdr)
   call dumpCICEInternal(ice_grid_i, export_slice, "inst_ice_ir_dir_albedo"          , "will provide", alidr)
   call dumpCICEInternal(ice_grid_i, export_slice, "inst_ice_vis_dif_albedo"         , "will provide", alvdf)
   call dumpCICEInternal(ice_grid_i, export_slice, "inst_ice_ir_dif_albedo"          , "will provide", alidf)
   call dumpCICEInternal(ice_grid_i, export_slice, "stress_on_air_ice_zonal"         , "will provide", strairxT)
   call dumpCICEInternal(ice_grid_i, export_slice, "stress_on_air_ice_merid"         , "will provide", strairyT)
   call dumpCICEInternal(ice_grid_i, export_slice, "stress_on_ocn_ice_zonal"         , "will provide", strocnxT)
   call dumpCICEInternal(ice_grid_i, export_slice, "stress_on_ocn_ice_merid"         , "will provide", strocnyT)
   call dumpCICEInternal(ice_grid_i, export_slice, "mean_sw_pen_to_ocn"              , "will provide", fswthru)
   call dumpCICEInternal(ice_grid_i, export_slice, "mean_net_sw_vis_dir_flx"        , "will provide", fswthruvdr)
   call dumpCICEInternal(ice_grid_i, export_slice, "mean_net_sw_vis_dif_flx"        , "will provide", fswthruvdf)
   call dumpCICEInternal(ice_grid_i, export_slice, "mean_net_sw_ir_dir_flx"         , "will provide", fswthruidr)
   call dumpCICEInternal(ice_grid_i, export_slice, "mean_net_sw_ir_dif_flx"         , "will provide", fswthruidf)
   call dumpCICEInternal(ice_grid_i, export_slice, "mean_up_lw_flx_ice"              , "will provide", flwout)
   call dumpCICEInternal(ice_grid_i, export_slice, "mean_sensi_heat_flx_atm_into_ice", "will provide", fsens)
   call dumpCICEInternal(ice_grid_i, export_slice, "mean_laten_heat_flx_atm_into_ice", "will provide", flat)
   call dumpCICEInternal(ice_grid_i, export_slice, "mean_evap_rate_atm_into_ice"     , "will provide", evap)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_inst_temp_height2m", "will provide", Tref)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_inst_spec_humid_height2m", "will provide", Qref)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_mean_albedo_vis_dir", "will provide", alvdr_ai)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_mean_albedo_nir_dir", "will provide", alidr_ai)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_mean_albedo_vis_dif", "will provide", alvdf_ai)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_mean_albedo_nir_dif", "will provide", alidf_ai)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_bare_ice_albedo", "will provide", albice)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_snow_albedo", "will provide", albsno)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_melt_pond_albedo", "will provide", albpnd)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_apeff_ai", "will provide", apeff_ai)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_mean_fresh_water_flx_to_ponds", "will provide", fpond)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_mean_fresh_water_to_ocean_rate", "will provide", fresh)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_mean_salt_rate", "will provide", fsalt)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_net_heat_flx_to_ocn", "will provide", fhocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_strairx_ocn", "will provide", strairx_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_strairy_ocn", "will provide", strairy_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_mean_sensi_heat_flx", "will provide", fsens_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_mean_laten_heat_flx", "will provide", flat_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_flwout_ocn", "will provide", flwout_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_evap_ocn", "will provide", evap_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_albedo_vis_dir", "will provide", alvdr_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_albedo_nir_dir", "will provide", alidr_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_albedo_vis_dif", "will provide", alvdf_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_albedo_nir_dif", "will provide", alidf_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_2m_atm_ref_temperature", "will provide", Tref_ocn)
   call dumpCICEInternal(ice_grid_i, export_slice, "xx_2m_atm_ref_spec_humidity", "will provide", Qref_ocn)
  end subroutine 

  subroutine cice_model_finalize(gcomp, rc)

    ! input arguments
    type(ESMF_GridComp)  :: gcomp
    integer, intent(out) :: rc
    
    ! local variables
    type(ESMF_Clock)     :: clock
    type(ESMF_Time)                        :: currTime
    character(len=*),parameter  :: subname='(cice_cap:cice_model_finalize)'

    rc = ESMF_SUCCESS

    write(info,*) subname,' --- finalize called --- '
    call ESMF_LogWrite(info, ESMF_LOGMSG_INFO, rc=dbrc)

    call NUOPC_ModelGet(gcomp, modelClock=clock, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    call ESMF_ClockGet(clock, currTime=currTime, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    call CICE_Finalize

    write(info,*) subname,' --- finalize completed --- '
    call ESMF_LogWrite(info, ESMF_LOGMSG_INFO, rc=dbrc)

  end subroutine cice_model_finalize

  subroutine CICE_AdvertiseFields(state, nfields, field_defs, rc)

    type(ESMF_State), intent(inout)             :: state
    integer,intent(in)                          :: nfields
    type(fld_list_type), intent(inout)          :: field_defs(:)
    integer, intent(inout)                      :: rc

    integer                                     :: i
    character(len=*),parameter  :: subname='(cice_cap:CICE_AdvertiseFields)'

    rc = ESMF_SUCCESS

    do i = 1, nfields

      call ESMF_LogWrite('Advertise: '//trim(field_defs(i)%stdname), ESMF_LOGMSG_INFO, rc=rc)
      if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out

      call NUOPC_Advertise(state, &
        standardName=field_defs(i)%stdname, &
        name=field_defs(i)%shortname, &
        rc=rc)
      if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
        line=__LINE__, &
        file=__FILE__)) &
        return  ! bail out

    enddo

  end subroutine CICE_AdvertiseFields

  subroutine CICE_RealizeFields(state, grid, nfields, field_defs, tag, rc)

    type(ESMF_State), intent(inout)             :: state
    type(ESMF_Grid), intent(in)                 :: grid
    integer, intent(in)                         :: nfields
    type(fld_list_type), intent(inout)          :: field_defs(:)
    character(len=*), intent(in)                :: tag
    integer, intent(inout)                      :: rc

    integer                                     :: i
    type(ESMF_Field)                            :: field
    integer                                     :: npet, nx, ny, pet, elb(2), eub(2), clb(2), cub(2), tlb(2), tub(2)
    type(ESMF_VM)                               :: vm
    character(len=*),parameter  :: subname='(cice_cap:CICE_RealizeFields)'
 
    rc = ESMF_SUCCESS

      !call ESMF_VMGetCurrent(vm, rc=rc)
      !if (rc /= ESMF_SUCCESS) call ESMF_Finalize()

      !call ESMF_VMGet(vm, petcount=npet, localPet=pet, rc=rc)
      !if (rc /= ESMF_SUCCESS) call ESMF_Finalize()

      !call ESMF_GridGet(grid, exclusiveLBound=elb, exclusiveUBound=eub, &
      !                        computationalLBound=clb, computationalUBound=cub, &
      !                        totalLBound=tlb, totalUBound=tub, rc=rc)
      !if (rc /= ESMF_SUCCESS) call ESMF_Finalize()

      !write(info, *) pet, 'exc', elb, eub, 'comp', clb, cub, 'total', tlb, tub
      !call ESMF_LogWrite(subname // tag // " Grid "// info, &
      !  ESMF_LOGMSG_INFO, &
      !  line=__LINE__, &
      !  file=__FILE__, &
      !  rc=dbrc)

    do i = 1, nfields

      if (field_defs(i)%assoc) then
        write(info, *) subname, tag, ' Field ', field_defs(i)%shortname, ':', &
          lbound(field_defs(i)%farrayPtr,1), ubound(field_defs(i)%farrayPtr,1), &
          lbound(field_defs(i)%farrayPtr,2), ubound(field_defs(i)%farrayPtr,2), &
          lbound(field_defs(i)%farrayPtr,3), ubound(field_defs(i)%farrayPtr,3)
        call ESMF_LogWrite(info, ESMF_LOGMSG_INFO, rc=dbrc)
        field = ESMF_FieldCreate(grid=grid, &
          farray=field_defs(i)%farrayPtr, indexflag=ESMF_INDEX_DELOCAL, &
!          farray=field_defs(i)%farrayPtr, indexflag=ESMF_INDEX_GLOBAL, &
!          totalLWidth=(/1,1/), totalUWidth=(/1,1/),&
          ungriddedLBound=(/1/), ungriddedUBound=(/max_blocks/), &
          name=field_defs(i)%shortname, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
          line=__LINE__, &
          file=__FILE__)) &
          return  ! bail out
      else
        field = ESMF_FieldCreate(grid, ESMF_TYPEKIND_R8, indexflag=ESMF_INDEX_DELOCAL, &
!          totalLWidth=(/1,1/), totalUWidth=(/1,1/),&
          ungriddedLBound=(/1/), ungriddedUBound=(/max_blocks/), &
          name=field_defs(i)%shortname, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
          line=__LINE__, &
          file=__FILE__)) &
          return  ! bail out
      endif

      if (NUOPC_IsConnected(state, fieldName=field_defs(i)%shortname)) then
        call NUOPC_Realize(state, field=field, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
          line=__LINE__, &
          file=__FILE__)) &
          return  ! bail out
        call ESMF_LogWrite(subname // tag // " Field "// field_defs(i)%stdname // " is connected.", &
          ESMF_LOGMSG_INFO, &
          line=__LINE__, &
          file=__FILE__, &
          rc=dbrc)
!        call ESMF_FieldPrint(field=field, rc=rc)
!        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
!          line=__LINE__, &
!          file=__FILE__)) &
!          return  ! bail out
      else
        call ESMF_LogWrite(subname // tag // " Field "// field_defs(i)%stdname // " is not connected.", &
          ESMF_LOGMSG_INFO, &
          line=__LINE__, &
          file=__FILE__, &
          rc=dbrc)
        ! TODO: Initialize the value in the pointer to 0 after proper restart is setup
        !if(associated(field_defs(i)%farrayPtr) ) field_defs(i)%farrayPtr = 0.0
        ! remove a not connected Field from State
        call ESMF_StateRemove(state, (/field_defs(i)%shortname/), rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
          line=__LINE__, &
          file=__FILE__)) &
          return  ! bail out
      endif

    enddo


  end subroutine CICE_RealizeFields

  !-----------------------------------------------------------------------------

  subroutine state_diagnose(State, string, rc)
    ! ----------------------------------------------
    ! Diagnose status of state
    ! ----------------------------------------------
    type(ESMF_State), intent(inout) :: State
    character(len=*), intent(in), optional :: string
    integer, intent(out), optional  :: rc

    ! local variables
    integer                     :: i,j,n
    integer                     :: fieldCount
    character(len=64) ,pointer  :: fieldNameList(:)
    character(len=64)           :: lstring
    real(ESMF_KIND_R8), pointer :: dataPtr(:,:,:)
    integer                     :: lrc
    character(len=*),parameter  :: subname='(cice_cap:state_diagnose)'

    lstring = ''
    if (present(string)) then
       lstring = trim(string)
    endif

    call ESMF_StateGet(State, itemCount=fieldCount, rc=lrc)
    if (ESMF_LogFoundError(rcToCheck=lrc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
    allocate(fieldNameList(fieldCount))
    call ESMF_StateGet(State, itemNameList=fieldNameList, rc=lrc)
    if (ESMF_LogFoundError(rcToCheck=lrc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
    do n = 1, fieldCount
      call State_GetFldPtr(State, fieldNameList(n), dataPtr, rc=lrc)
      if (ESMF_LogFoundError(rcToCheck=lrc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
      write(tmpstr,'(A,3g14.7)') trim(subname)//' '//trim(lstring)//':'//trim(fieldNameList(n)), &
        minval(dataPtr),maxval(dataPtr),sum(dataPtr)
!      write(tmpstr,'(A)') trim(subname)//' '//trim(lstring)//':'//trim(fieldNameList(n))
      call ESMF_LogWrite(trim(tmpstr), ESMF_LOGMSG_INFO, rc=dbrc)
    enddo
    deallocate(fieldNameList)

    if (present(rc)) rc = lrc

  end subroutine state_diagnose

  !-----------------------------------------------------------------------------

  subroutine state_reset(State, value, rc)
    ! ----------------------------------------------
    ! Set all fields to value in State
    ! If value is not provided, reset to 0.0
    ! ----------------------------------------------
    type(ESMF_State), intent(inout) :: State
    real(ESMF_KIND_R8), intent(in), optional :: value
    integer, intent(out), optional  :: rc

    ! local variables
    integer                     :: i,j,k,n
    integer                     :: fieldCount
    character(len=64) ,pointer  :: fieldNameList(:)
    real(ESMF_KIND_R8)          :: lvalue
    real(ESMF_KIND_R8), pointer :: dataPtr(:,:,:)
    character(len=*),parameter :: subname='(cice_cap:state_reset)'

    if (present(rc)) rc = ESMF_SUCCESS

    lvalue = 0._ESMF_KIND_R8
    if (present(value)) then
      lvalue = value
    endif

    call ESMF_StateGet(State, itemCount=fieldCount, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
    allocate(fieldNameList(fieldCount))
    call ESMF_StateGet(State, itemNameList=fieldNameList, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
    do n = 1, fieldCount
      call State_GetFldPtr(State, fieldNameList(n), dataPtr, rc=rc)
      if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

      do k=lbound(dataPtr,3),ubound(dataPtr,3)
      do j=lbound(dataPtr,2),ubound(dataPtr,2)
      do i=lbound(dataPtr,1),ubound(dataPtr,1)
         dataPtr(i,j,k) = lvalue
      enddo
      enddo
      enddo

    enddo
    deallocate(fieldNameList)

  end subroutine state_reset

  !-----------------------------------------------------------------------------

  subroutine State_GetFldPtr(ST, fldname, fldptr, rc)
    type(ESMF_State), intent(in) :: ST
    character(len=*), intent(in) :: fldname
    real(ESMF_KIND_R8), pointer, intent(in) :: fldptr(:,:,:)
    integer, intent(out), optional :: rc

    ! local variables
    type(ESMF_Field) :: lfield
    integer :: lrc
    character(len=*),parameter :: subname='(cice_cap:State_GetFldPtr)'

    call ESMF_StateGet(ST, itemName=trim(fldname), field=lfield, rc=lrc)
    if (ESMF_LogFoundError(rcToCheck=lrc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
    call ESMF_FieldGet(lfield, farrayPtr=fldptr, rc=lrc)
    if (ESMF_LogFoundError(rcToCheck=lrc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

    if (present(rc)) rc = lrc

  end subroutine State_GetFldPtr

  !-----------------------------------------------------------------------------
  logical function FieldBundle_FldChk(FB, fldname, rc)
    type(ESMF_FieldBundle), intent(in) :: FB
    character(len=*)      ,intent(in) :: fldname
    integer, intent(out), optional :: rc

    ! local variables
    integer :: lrc
    character(len=*),parameter :: subname='(module_MEDIATOR:FieldBundle_FldChk)'

    if (present(rc)) rc = ESMF_SUCCESS

    FieldBundle_FldChk = .false.

    call ESMF_FieldBundleGet(FB, fieldName=trim(fldname), isPresent=isPresent, rc=lrc)
    if (present(rc)) rc = lrc
    if (ESMF_LogFoundError(rcToCheck=lrc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
    if (isPresent) then
       FieldBundle_FldChk = .true.
    endif

  end function FieldBundle_FldChk

  !-----------------------------------------------------------------------------

  subroutine FieldBundle_GetFldPtr(FB, fldname, fldptr, rc)
    type(ESMF_FieldBundle), intent(in) :: FB
    character(len=*)      , intent(in) :: fldname
    real(ESMF_KIND_R8), pointer, intent(in) :: fldptr(:,:)
    integer, intent(out), optional :: rc

    ! local variables
    type(ESMF_Field) :: lfield
    integer :: lrc
    character(len=*),parameter :: subname='(module_MEDIATOR:FieldBundle_GetFldPtr)'

    if (present(rc)) rc = ESMF_SUCCESS

    call ESMF_FieldBundleGet(FB, fieldName=trim(fldname), field=lfield, rc=lrc)
    if (ESMF_LogFoundError(rcToCheck=lrc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return
    call ESMF_FieldGet(lfield, farrayPtr=fldptr, rc=lrc)
    if (ESMF_LogFoundError(rcToCheck=lrc, msg=ESMF_LOGERR_PASSTHRU, line=__LINE__, file=__FILE__)) return

    if (present(rc)) rc = lrc

  end subroutine FieldBundle_GetFldPtr

  !-----------------------------------------------------------------------------

  subroutine CICE_FieldsSetup
    character(len=*),parameter  :: subname='(cice_cap:CICE_FieldsSetup)'

!--------- import fields to Sea Ice -------------

! tcraig, don't point directly into cice data YET (last field is optional in interface)
! instead, create space for the field when it's "realized".
    call fld_list_add(fldsToIce_num, fldsToIce, "inst_height_lowest"       , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "inst_temp_height_lowest"       , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "inst_spec_humid_height_lowest" , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "inst_zonal_wind_height_lowest" , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "inst_merid_wind_height_lowest" , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "inst_pres_height_lowest"       , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "mean_down_lw_flx"         , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "mean_down_sw_vis_dir_flx" , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "mean_down_sw_vis_dif_flx" , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "mean_down_sw_ir_dir_flx"  , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "mean_down_sw_ir_dif_flx"  , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "mean_prec_rate"           , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "mean_fprec_rate"          , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "sea_surface_temperature"  , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "s_surf"                   , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "sea_lev"                  , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "sea_surface_slope_zonal"  , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "sea_surface_slope_merid"  , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "ocn_current_zonal"        , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "ocn_current_merid"        , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "freezing_melting_potential", "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "mixed_layer_depth"        , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "mean_zonal_moment_flx", "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "mean_merid_moment_flx", "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "inst_surface_height"  , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "inst_temp_height2m"  , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "inst_spec_humid_height2m"  , "will provide")
    call fld_list_add(fldsToIce_num, fldsToIce, "air_density_height_lowest"  , "will provide")

!   call fld_list_add(fldsToIce_num, fldsToIce, "inst_zonal_wind_height10m", "will provide", strax)
!   call fld_list_add(fldsToIce_num, fldsToIce, "inst_merid_wind_height10m", "will provide", stray)
!   call fld_list_add(fldsToIce_num, fldsToIce, "inst_pres_height_surface" , "will provide", zlvl)
!   call fld_list_add(fldsToIce_num, fldsToIce, "xx_pot_air_temp"          , "will provide", potT)
!   call fld_list_add(fldsToIce_num, fldsToIce, "inst_temp_height2m"       , "will provide", Tair)
!   call fld_list_add(fldsToIce_num, fldsToIce, "inst_spec_humid_height2m" , "will provide", Qa)
!   call fld_list_add(fldsToIce_num, fldsToIce, "xx_inst_air_density"      , "will provide", rhoa)
!   call fld_list_add(fldsToIce_num, fldsToIce, "mean_down_sw_vis_dir_flx" , "will provide", swvdr)
!   call fld_list_add(fldsToIce_num, fldsToIce, "mean_down_sw_vis_dif_flx" , "will provide", swvdf)
!   call fld_list_add(fldsToIce_num, fldsToIce, "mean_down_sw_ir_dir_flx", "will provide", swidr)
!   call fld_list_add(fldsToIce_num, fldsToIce, "mean_down_sw_ir_dif_flx", "will provide", swidf)
!   call fld_list_add(fldsToIce_num, fldsToIce, "mean_down_lw_flx", "will provide", flw)
!   call fld_list_add(fldsToIce_num, fldsToIce, "mean_prec_rate", "will provide", frain)
!   call fld_list_add(fldsToIce_num, fldsToIce, "xx_mean_fprec_rate", "will provide", frain)
!   call fld_list_add(fldsToIce_num, fldsToIce, "xx_faero_atm", "will provide", faero_atm)
!   call fld_list_add(fldsToIce_num, fldsToIce, "ocn_current_zonal", "will provide", uocn)
!   call fld_list_add(fldsToIce_num, fldsToIce, "ocn_current_merid", "will provide", vocn)
!   call fld_list_add(fldsToIce_num, fldsToIce, "sea_surface_slope_zonal", "will provide", ss_tltx)
!   call fld_list_add(fldsToIce_num, fldsToIce, "sea_surface_slope_merid", "will provide", ss_tlty)
!   call fld_list_add(fldsToIce_num, fldsToIce, "s_surf", "will provide", sss)
!   call fld_list_add(fldsToIce_num, fldsToIce, "sea_surface_temperature", "will provide", sst)
!   call fld_list_add(fldsToIce_num, fldsToIce, "freezing_melting_potential", "will provide", frzmlt)
!   call fld_list_add(fldsToIce_num, fldsToIce, "xx_inst_frz_mlt_potential", "will provide", frzmlt_init)
!   call fld_list_add(fldsToIce_num, fldsToIce, "freezing_temp", "will provide", Tf)
!   call fld_list_add(fldsToIce_num, fldsToIce, "mean_deep_ocean_down_heat_flx", "will provide", qdp)
!   call fld_list_add(fldsToIce_num, fldsToIce, "mixed_layer_depth", "will provide", hmix)
!   call fld_list_add(fldsToIce_num, fldsToIce, "xx_daice_da", "will provide", daice_da)

!--------- export fields from Sea Ice -------------

!tcx    call fld_list_add(fldsFrIce_num, fldsFrIce, "sea_ice_temperature"             , "will provide", icetemp_cpl)
!tcx    call fld_list_add(fldsFrIce_num, fldsFrIce, "inst_ice_vis_dir_albedo"         , "will provide", alvdr)
!tcx    call fld_list_add(fldsFrIce_num, fldsFrIce, "inst_ice_ir_dir_albedo"          , "will provide", alidr)
!tcx    call fld_list_add(fldsFrIce_num, fldsFrIce, "inst_ice_vis_dif_albedo"         , "will provide", alvdf)
!tcx    call fld_list_add(fldsFrIce_num, fldsFrIce, "inst_ice_ir_dif_albedo"          , "will provide", alidf)
!tcx    call fld_list_add(fldsFrIce_num, fldsFrIce, "ice_fraction"                    , "will provide", aice_cpl)
!    call fld_list_add(fldsFrIce_num, fldsFrIce, "stress_on_air_ice_zonal"         , "will provide", strairxT)
!    call fld_list_add(fldsFrIce_num, fldsFrIce, "stress_on_air_ice_merid"         , "will provide", strairyT)
!    call fld_list_add(fldsFrIce_num, fldsFrIce, "stress_on_ocn_ice_zonal"         , "will provide", strocnxT)
!    call fld_list_add(fldsFrIce_num, fldsFrIce, "stress_on_ocn_ice_merid"         , "will provide", strocnyT)
!    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_sw_pen_to_ocn"              , "will provide", fswthru)
!    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_up_lw_flx_ice"              , "will provide", flwout)
!    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_sensi_heat_flx_atm_into_ice", "will provide", fsens)
!    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_laten_heat_flx_atm_into_ice", "will provide", flat)
!tcx    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_evap_rate_atm_into_ice"     , "will provide", evap)
    call fld_list_add(fldsFrIce_num, fldsFrIce, "sea_ice_temperature"             , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "inst_ice_vis_dir_albedo"         , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "inst_ice_ir_dir_albedo"          , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "inst_ice_vis_dif_albedo"         , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "inst_ice_ir_dif_albedo"          , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "ice_mask"                        , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "ice_fraction"                    , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "stress_on_air_ice_zonal"         , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "stress_on_air_ice_merid"         , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "stress_on_ocn_ice_zonal"         , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "stress_on_ocn_ice_merid"         , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_sw_pen_to_ocn"              , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_net_sw_vis_dir_flx"        , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_net_sw_vis_dif_flx"        , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_net_sw_ir_dir_flx"         , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_net_sw_ir_dif_flx"         , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_up_lw_flx_ice"              , "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_sensi_heat_flx_atm_into_ice", "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_laten_heat_flx_atm_into_ice", "will provide")
    call fld_list_add(fldsFrIce_num, fldsFrIce, "mean_evap_rate_atm_into_ice"     , "will provide")

!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_inst_temp_height2m", "will provide", Tref)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_inst_spec_humid_height2m", "will provide", Qref)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_mean_albedo_vis_dir", "will provide", alvdr_ai)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_mean_albedo_nir_dir", "will provide", alidr_ai)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_mean_albedo_vis_dif", "will provide", alvdf_ai)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_mean_albedo_nir_dif", "will provide", alidf_ai)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_bare_ice_albedo", "will provide", albice)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_snow_albedo", "will provide", albsno)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_melt_pond_albedo", "will provide", albpnd)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_apeff_ai", "will provide", apeff_ai)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_mean_fresh_water_flx_to_ponds", "will provide", fpond)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_mean_fresh_water_to_ocean_rate", "will provide", fresh)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_mean_salt_rate", "will provide", fsalt)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_net_heat_flx_to_ocn", "will provide", fhocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_faero_ocn", "will provide", faero_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_strairx_ocn", "will provide", strairx_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_strairy_ocn", "will provide", strairy_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_mean_sensi_heat_flx", "will provide", fsens_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_mean_laten_heat_flx", "will provide", flat_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_flwout_ocn", "will provide", flwout_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_evap_ocn", "will provide", evap_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_albedo_vis_dir", "will provide", alvdr_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_albedo_nir_dir", "will provide", alidr_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_albedo_vis_dif", "will provide", alvdf_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_albedo_nir_dif", "will provide", alidf_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_2m_atm_ref_temperature", "will provide", Tref_ocn)
!   call fld_list_add(fldsFrIce_num, fldsFrIce, "xx_2m_atm_ref_spec_humidity", "will provide", Qref_ocn)


  end subroutine CICE_FieldsSetup

  !-----------------------------------------------------------------------------

  subroutine fld_list_add(num, fldlist, stdname, transferOffer, data, shortname)
    ! ----------------------------------------------
    ! Set up a list of field information
    ! ----------------------------------------------
    integer,             intent(inout)  :: num
    type(fld_list_type), intent(inout)  :: fldlist(:)
    character(len=*),    intent(in)     :: stdname
    character(len=*),    intent(in)     :: transferOffer
    real(ESMF_KIND_R8), dimension(:,:,:), optional, target :: data
    character(len=*),    intent(in),optional :: shortname

    ! local variables
    integer :: rc
    character(len=*), parameter :: subname='(cice_cap:fld_list_add)'

    ! fill in the new entry

    num = num + 1
    if (num > fldsMax) then
      call ESMF_LogWrite(trim(subname)//": ERROR num gt fldsMax "//trim(stdname), &
        ESMF_LOGMSG_ERROR, line=__LINE__, file=__FILE__, rc=dbrc)
      return
    endif

    fldlist(num)%stdname        = trim(stdname)
    if (present(shortname)) then
       fldlist(num)%shortname   = trim(shortname)
    else
       fldlist(num)%shortname   = trim(stdname)
    endif
    fldlist(num)%transferOffer  = trim(transferOffer)
    if (present(data)) then
      fldlist(num)%assoc        = .true.
      fldlist(num)%farrayPtr    => data
    else
      fldlist(num)%assoc        = .false.
    endif

  end subroutine fld_list_add

  subroutine dumpCICEInternal(grid, slice, stdname, nop, farray)

    type(ESMF_Grid)          :: grid
    integer, intent(in)      :: slice
    character(len=*)         :: stdname
    character(len=*)         :: nop
    real(ESMF_KIND_R8), dimension(:,:,:), target :: farray

    type(ESMF_Field)         :: field
    real(ESMF_KIND_R8), dimension(:,:), pointer  :: f2d
    integer                  :: rc

    return ! remove this line to debug field connection

    field = ESMF_FieldCreate(grid, ESMF_TYPEKIND_R8, &
      indexflag=ESMF_INDEX_DELOCAL, &
      name=stdname, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    call ESMF_FieldGet(field, farrayPtr=f2d, rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    f2d(:,:) = farray(:,:,1)

    call ESMF_FieldWrite(field, filename='field_ice_internal_'//trim(stdname)//'.nc', &
      timeslice=slice, rc=rc) 
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out

    call ESMF_FieldDestroy(field, noGarbage=.true., rc=rc)
    if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
      line=__LINE__, &
      file=__FILE__)) &
      return  ! bail out
    
  end subroutine

  !-----------------------------------------------------------------------------
end module cice_cap_mod
