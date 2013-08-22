module NUOPC_Model

    implicit none

    contains

    subroutine routine_SetServices(gcomp, rc)
        type(ESMF_GridComp)  :: gcomp
        integer, intent(out) :: rc
        print *, "Dummy"
    end subroutine routine_SetServices

end module NUOPC_Model
