**Module** :f:mod:`NUOPC_Comp`
==============================

.. f:module:: NUOPC_Comp
    :synopsis: Contains general subroutines relevant to all NUOPC Components.

.. f:subroutine:: NUOPC_GridCompDerive(comp, genericSetServicesRoutine, rc)

    **Call using NUOPC_CompDerive().**
      
    .. code-block:: fortran
    
       type(ESMF_GridComp), intent(in)            :: comp
       interface
         subroutine genericSetServicesRoutine(gridcomp, rc)
            use ESMF
            implicit none
            type(ESMF_GridComp)        :: gridcomp ! must not be optional
            integer, intent(out)       :: rc       ! must not be optional
         end subroutine
       end interface
       integer,             intent(out), optional :: rc
        
        
    Derive a GridComp (i.e., Model, Mediator, or Driver) from a generic 
    component by calling into the specified SetServices() routine of the
    generic component. This is typically the first call in the
    SetServices() routine of the specializing component.

..    :param ESMF_GridComp comp: Reference to the component itself
..    :param subroutine genericSetServicesRoutine: Pointer to SetServices routine in generic component
..    :param integer rc [out]: Return code
    
    
   

.. f:subroutine:: NUOPC_GridCompSetEntryPoint(comp, methodflag, phaseLabelList, userRoutine, rc)

    **Call using NUOPC_CompSetEntryPoint().**
    
    Set an entry point for a GridComp (i.e., Model, Mediator, or Driver). Publish
    the new entry point in the correct PhaseMap component attribute.
    
    :param ESMF_GridComp comp: Reference to the component itself
    :param ESMF_Method_Flag methodflag [in]: The type of method
    :param character(*) phaseLabelList(\:) [in]: Name of NUOPC phase
    :param subroutine userRoutine: Pointer to subroutine to register
    :param integer rc [out]: Return code
    
    