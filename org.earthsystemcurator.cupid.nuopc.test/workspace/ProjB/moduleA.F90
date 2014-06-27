module ModuleA

    ! A simple module for testing purposes

  implicit none
  
  private
  
  !public SetServices
  
  contains
  
  subroutine SubA1()
    print *, "Inside SubA1()"
    call SubA2()
    call SubA3()
  end subroutine
  
  subroutine SubA2()
    print *, "Inside SubA2()"
  end subroutine
  
  subroutine SubA3()
    print *, "Inside SubA3()"
  end subroutine

end module
