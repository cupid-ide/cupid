/* general */
callArgIdent(_id, _pid, _idx, _keyword, _identExpr) :-
  callArg(_id, _pid, _idx, _keyword, _arg_expr_id),
  ident(_arg_expr_id, _, _identExpr).


/* esmf set services methods */
esmf_setservices(_id, _parentid, _name) :- 
  subroutine(_id, _parentid, _name),
  param(_pid1, _id, 1, _pname1, 'type(esmf_gridcomp)', _, _),
  param(_pid2, _id, 2, _pname2, 'integer', false, true),
  ( 	_name == 'SetServices', !;
  	call_(_cid, _id, 'NUOPC_CompDerive')
  ).
 
  
/* esmf registered specialization */
esmf_regspec(_sid, _modid, _name, _genericComp, _specLabelExpr) :-
  esmf_setservices(_ssid, _modid, _ssname),
  esmf_specmethod(_sid, _modid, _name),
  call_(_regid, _ssid, 'NUOPC_CompSpecialize'),
  callArgIdent(_, _regid, _, 'specLabel', _specLabelExpr),
    uses(_uid, _modid, _genericComp),
    usesEntity(_ueid, _uid, _, _specLabelExpr, _),
  callArgIdent(_, _regid, _, 'specRoutine', _name).
  
  
  
/* esmf specialization subroutine signature */
esmf_specmethod(_id, _parentid, _name) :- 
  subroutine(_id, _parentid, _name),
  param(_pid1, _id, 1, _pname1, 'type(esmf_gridcomp)', _, _),
  param(_pid2, _id, 2, _pname2, 'integer', false, true).
  
  
  