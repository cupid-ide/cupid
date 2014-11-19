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
  
callArgWithType(_id, _pid, _idx, _keyword, _type, _expr) :-
	callArg(_id, _pid, _idx, _keyword, _arg_expr_id),
	arrayConstructor(_arg_expr_id, _, _expr),
	_type = 'array'.
            

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
  
  
/* esmf entry point subroutine signature */
esmf_entrypoint(_id, _parentid, _name, _param_gridcomp, _param_import, _param_export, _param_clock, _param_rc) :- 
  subroutine(_id, _parentid, _name),
  param(_pid1, _id, 1, _param_gridcomp, 'type(esmf_gridcomp)', _, _),
  param(_pid2, _id, 2, _param_import,   'type(esmf_state)',    _, _),
  param(_pid3, _id, 3, _param_export,   'type(esmf_state)',    _, _),
  param(_pid4, _id, 4, _param_clock,    'type(esmf_clock)',    _, _),
  param(_pid5, _id, 5, _param_rc,       'integer',             false, true).
  
/* esmf register entry point */
esmf_reg_entrypoint(_epId, _modid, _epName, _phaseLabel, _regid) :-
  esmf_setservices(_ssid, _modid, _ssname),
  esmf_entrypoint(_epId, _modid, _epName, _, _, _, _, _),
  call_(_regid, _ssid, 'NUOPC_CompSetEntryPoint'),
	callArgIdent(_, _regid, _, 'userRoutine', _, _epName),
	callArgWithType(_, _regid, 2, _, _, _methodExpr),
	callArg(_, _regid, _, 'phaseLabelList', _phaseLabelExprId),
	arrayConstructorVal(_, _phaseLabelExprId, _, _phaseLabel).  
  