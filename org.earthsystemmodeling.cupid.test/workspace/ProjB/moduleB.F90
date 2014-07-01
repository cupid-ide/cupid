module ModuleB

    ! A simple module for testing purposes

  implicit none
  
  private
  
  !public SetServices
  
  contains
  
  subroutine SubB1()
    print *, "Inside SubB1()"
    call SubB2()
    call SubB3()
  end subroutine
  
  subroutine SubB2()
    print *, "Inside SubB2()"
  end subroutine
  
  subroutine SubB3()
    print *, "Inside SubB3()"
  end subroutine

end module
