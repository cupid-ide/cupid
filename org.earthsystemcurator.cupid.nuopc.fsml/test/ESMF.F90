module ESMF

    implicit none


   contains

    subroutine ESMF_GridCompSetEntryPoint(gcomp, method, userRoutine, phase, rc)
        print *, "Dummy module"
    end subroutine

    subroutine NoArgs()
        integer :: x
        x = x + 1
    end subroutine

end module ESMF
