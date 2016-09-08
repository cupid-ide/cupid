module sw_cap
	
    use ESMF
    use NUOPC
    use NUOPC_Model, model_SetServices => SetServices, &
        model_label_Advance => label_Advance
		
    implicit none

    public SetServices
	
contains

    subroutine SetServices(gcomp, rc)
        type(ESMF_GridComp)  :: gcomp
        integer, intent(out) :: rc
    
        rc = ESMF_SUCCESS
    
        ! NUOPC_Driver registers the generic methods
        call NUOPC_CompDerive(gcomp, model_SetServices, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out

        call ESMF_GridCompSetEntryPoint(gcomp, ESMF_METHOD_INITIALIZE, &
            userRoutine=InitializeP0, phase=0, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out

        call NUOPC_CompSetEntryPoint(gcomp, ESMF_METHOD_INITIALIZE, &
            phaseLabelList=(/"IPDv01p1"/), userRoutine=AdvertiseFields, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out

        call NUOPC_CompSetEntryPoint(gcomp, ESMF_METHOD_INITIALIZE, &
            phaseLabelList=(/"IPDv01p3"/), userRoutine=RealizeFieldsProvidingGrid, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out

        call NUOPC_CompSpecialize(gcomp, specLabel=model_label_Advance, &
            specRoutine=ModelAdvance, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out
    
    end subroutine


    subroutine InitializeP0(gcomp, importState, exportState, clock, rc)
        type(ESMF_GridComp)  :: gcomp
        type(ESMF_State)     :: importState, exportState
        type(ESMF_Clock)     :: clock
        integer, intent(out) :: rc
    
        rc = ESMF_SUCCESS
     
        ! Switch to "IPDv01" by filtering all other phaseMap entries
        call NUOPC_CompFilterPhaseMap(gcomp, ESMF_METHOD_INITIALIZE, &
            acceptStringList=(/"IPDv01"/), rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out
    
    end subroutine


    subroutine AdvertiseFields(gcomp, importState, exportState, clock, rc)
        type(ESMF_GridComp)  :: gcomp
        type(ESMF_State)     :: importState, exportState
        type(ESMF_Clock)     :: clock
        integer, intent(out) :: rc
    
        rc = ESMF_SUCCESS

        call NUOPC_FieldDictionaryAddEntry("height", "m", rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out

        !call NUOPC_FieldDictionaryAddEntry("vwind", "m-2", rc=rc)
        ! if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
        !    line=__LINE__, &
        !    file=__FILE__)) &
         !   return  ! bail out

        call NUOPC_Advertise(exportState, StandardName="height", name="h", rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out

        !call NUOPC_Advertise(importState, StandardName="vwind", name="vwind", rc=rc)
        !if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
        !    line=__LINE__, &
        !    file=__FILE__)) &
        !    return  ! bail out
    
    end subroutine


    subroutine RealizeFieldsProvidingGrid(gcomp, importState, exportState, clock, rc)
        type(ESMF_GridComp)  :: gcomp
        type(ESMF_State)     :: importState, exportState
        type(ESMF_Clock)     :: clock
        integer, intent(out) :: rc
    
        type(ESMF_Grid) :: ModelGrid
        type(ESMF_Field) :: height
    
        rc = ESMF_SUCCESS
    
        ModelGrid = CreateGrid_ModelGrid(rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out


        ! field "ExportField"
        height = ESMF_FieldCreate(name="h", grid=ModelGrid, &
            typekind=ESMF_TYPEKIND_R8, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out
	
        call NUOPC_Realize(exportState, field=height, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out
    
    
    
    end subroutine


    function CreateGrid_ModelGrid(rc)
        type(ESMF_Grid) :: CreateGrid_ModelGrid
        integer, intent(out), optional :: rc
    
        rc = ESMF_SUCCESS
        CreateGrid_ModelGrid = ESMF_GridCreateNoPeriDimUfrm(name="ModelGrid", &
            minIndex=(/1, 1/), &
            maxIndex=(/100, 100/), &
            minCornerCoord=(/1.0_ESMF_KIND_R8, 1.0_ESMF_KIND_R8/), &
            maxCornerCoord=(/100.0_ESMF_KIND_R8, 100.0_ESMF_KIND_R8/), &
            rc=rc)
    
    end function    

    subroutine ModelAdvance(gcomp, rc)
        type(ESMF_GridComp)  :: gcomp
        integer, intent(out) :: rc

         ! local variables
        type(ESMF_Clock)              :: clock
        type(ESMF_State)              :: importState, exportState
        type(ESMF_Time)               :: currTime
        type(ESMF_TimeInterval)       :: timeStep

        rc = ESMF_SUCCESS

        ! query the Component for its clock, importState and exportState
        call NUOPC_ModelGet(gcomp, modelClock=clock, importState=importState, &
            exportState=exportState, rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out
    
        ! advance the model: currTime -> currTime + timeStep

        call ESMF_ClockPrint(clock, options="currTime", &
            preString="------>Advancing sw_cap from: ", rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out

        call ESMF_ClockPrint(clock, options="stopTime", &
            preString="--------------------------------> to: ", rc=rc)
        if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
            line=__LINE__, &
            file=__FILE__)) &
            return  ! bail out

    end subroutine



	
end module


