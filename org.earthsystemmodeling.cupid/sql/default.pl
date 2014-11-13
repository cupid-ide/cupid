/* general */
callArgIdent(_id, _pid, _idx, _keyword, _identType, _identExpr) :-
  callArg(_id, _pid, _idx, _keyword, _arg_expr_id),
  ident(_arg_expr_id, _, _identType, _identExpr).

callArgConst(_id, _pid, _idx, _keyword, _constType, _constExpr) :-
  callArg(_id, _pid, _idx, _keyword, _arg_expr_id),
  const(_arg_expr_id, _, _constType, _constExpr).
  
callArgWithType(_id, _pid, _idx, _keyword, _type, _expr) :-
  callArg(_id, _pid, _idx, _keyword, _arg_expr_id),
  ident(_arg_expr_id, _, _type, _expr).
  
callArgWithType(_id, _pid, _idx, _keyword, _type, _expr) :-
  callArg(_id, _pid, _idx, _keyword, _arg_expr_id),
  const(_arg_expr_id, _, _type, _expr).
            
/* create table const(
      id bigint default global_fact_id.nextval primary key,
      parent_id bigint,
      type varchar(10),
      val varchar(100)); */


/* esmf set services methods */
esmf_setservices(_id, _parentid, _name) :- 
  subroutine(_id, _parentid, _name),
  param(_pid1, _id, 1, _pname1, 'type(esmf_gridcomp)', _, _),
  param(_pid2, _id, 2, _pname2, 'integer', false, true),
  ( 	_name == 'SetServices', !;
  	call_(_cid, _id, 'NUOPC_CompDerive')
  ).
 
  
/* esmf registered specialization */
esmf_regspec(_sid, _modid, _name, _genericComp, _specLabelExpr, _specLabelOrig, _regid) :-
  esmf_setservices(_ssid, _modid, _ssname),
  esmf_specmethod(_sid, _modid, _name, _, _),
  call_(_regid, _ssid, 'NUOPC_CompSpecialize'),
  callArgIdent(_, _regid, _, 'specLabel', _, _specLabelExpr),
    uses(_uid, _modid, _genericComp),
    usesEntity(_ueid, _uid, _specLabelOrig, _specLabelExpr, _),
  callArgIdent(_, _regid, _, 'specRoutine', _, _name).
  
  
  
/* esmf specialization subroutine signature */
esmf_specmethod(_id, _parentid, _name, _param_gridcomp, _param_rc) :- 
  subroutine(_id, _parentid, _name),
  param(_pid1, _id, 1, _param_gridcomp, 'type(esmf_gridcomp)', _, _),
  param(_pid2, _id, 2, _param_rc, 'integer', false, true).
  
  
  