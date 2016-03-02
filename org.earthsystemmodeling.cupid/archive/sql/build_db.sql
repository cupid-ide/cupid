create schema if not exists prolog;
set schema prolog;

drop view if exists esmf_regspec;
drop view if exists esmf_setservices;
drop view if exists esmf_specmethod;
drop view if exists esmf_regspec;
drop view if exists callArgIdent;
drop view if exists callArgConst;

drop table if exists compilationUnit;
drop table if exists tokenRef;
drop table if exists module;
drop table if exists uses;
drop table if exists usesEntity;
drop table if exists call_;
drop table if exists subroutine;
drop table if exists param;
drop table if exists callArg;
drop table if exists ident;
drop table if exists const;
drop table if exists arrayConstructor;
drop table if exists arrayConstructorVal;
drop sequence if exists global_fact_id;

create sequence global_fact_id;

create table compilationUnit(
	id bigint default global_fact_id.nextval primary key,
	filename varchar(100),
	path varchar(1024));

create table tokenRef(
	id bigint primary key,
	filename varchar(500),
	_offset int,
	length int,
	type varchar(20));

create table module(
    id bigint default global_fact_id.nextval primary key, 
    parent_id bigint,
    name varchar(100));
    
create table uses(
	id bigint default global_fact_id.nextval primary key,
	parent_id bigint,
	name varchar(100));
	
create table usesEntity(
	id bigint default global_fact_id.nextval primary key,
	parent_id bigint,
	name varchar(100),
	newName varchar(100),
	only boolean);

create table subroutine(
     id bigint default global_fact_id.nextval primary key, 
     parent_id bigint,
     name varchar(100));
       
create table param(
     id bigint default global_fact_id.nextval primary key, 
     parent_id bigint,
     index int,
     name varchar(100),
     type varchar(200),
     intentIn boolean,
     intentOut boolean);

create table call_(
     id bigint default global_fact_id.nextval primary key, 
     parent_id bigint,
     name varchar(100)); 
     
create table callArg(
	 id bigint default global_fact_id.nextval primary key,
	 parent_id bigint,
	 argIndex int,
	 keyword varchar(100),
	 expr_id bigint);
	 
create table ident(
	 id bigint default global_fact_id.nextval primary key,
	 parent_id bigint,
	 type varchar(200),
	 name varchar(100));
	
create table const(
      id bigint default global_fact_id.nextval primary key,
      parent_id bigint,
      type varchar(10),
      val varchar(100));
      
create table arrayConstructor(
     id bigint default global_fact_id.nextval primary key,
     parent_id bigint,
     val varchar(100));
     
create table arrayConstructorVal(
     id bigint default global_fact_id.nextval primary key,
     parent_id bigint,
     index int,
     val varchar(100));
     
-- call arguments that are identifiers
CREATE OR REPLACE VIEW callArgIdent AS
SELECT callArg.id, callArg.parent_id AS call_id, callArg.argIndex, callArg.keyword, ident.type, ident.name
FROM callArg
INNER JOIN ident ON ident.id = callArg.expr_id;

--call arguments that are constants
CREATE OR REPLACE VIEW callArgConst AS
SELECT callArg.id, callArg.parent_id AS call_id, callArg.argIndex, callArg.keyword, const.type, const.val
FROM callArg
INNER JOIN const ON const.id = callArg.expr_id;


CREATE OR REPLACE VIEW esmf_setservices AS
SELECT s.id, s.parent_id as mod_id, s.name, p1.name as param_gcomp, p2.name as param_rc
FROM subroutine s
INNER JOIN param p1 ON p1.parent_id = s.id 
	and p1.index = 1
	and p1.type = 'type(esmf_gridcomp)'
INNER JOIN param p2 ON p2.parent_id = s.id 
	and p2.index = 2
	and p2.type = 'integer'
	and p2.intentIn = 0
	and p2.intentOut = 1
WHERE s.name = 'SetServices' 
	OR EXISTS 
		(SELECT * from call_ c WHERE c.parent_id = s.id and c.name='NUOPC_CompDerive');


CREATE OR REPLACE VIEW esmf_specmethod AS
SELECT s.id, s.parent_id as mod_id, s.name, p1.name as param_gcomp, p2.name as param_rc
FROM subroutine s
INNER JOIN param p1 ON p1.parent_id = s.id 
	and p1.index = 1
	and p1.type = 'type(esmf_gridcomp)'
INNER JOIN param p2 ON p2.parent_id = s.id 
	and p2.index = 2
	and p2.type = 'integer'
	and p2.intentIn = 0
	and p2.intentOut = 1;


CREATE OR REPLACE VIEW esmf_regspec AS
SELECT DISTINCT
    sm.id,  				-- the id of the specialization subroutine
	ss.mod_id, 
	argSpecRoutine.name, 	-- the name of the specialization subroutine
	genericUse.name AS genericUse,
	argSpecLabel.name AS specLabelExpr,  -- spec label used in the registration call
	usesEntity.name as specLabelOrig,    -- spec label in the use statement
	argSpecPhaseLabel.val as specPhaseLabel,  -- optional phase label for the specialization
	regCall.id as reg_id,                -- id of call to NUOPC_CompSpecialize
	sm.param_gcomp, 					 -- name of gcomp parameter in SetServices
	sm.param_rc	                         -- name of rc parameter in SetServices
FROM esmf_setservices AS ss
INNER JOIN esmf_specmethod AS sm ON sm.mod_id = ss.mod_id
INNER JOIN call_ AS regCall ON regCall.parent_id = ss.id 
	AND regCall.name = 'NUOPC_CompSpecialize'
INNER JOIN callArgIdent AS argSpecLabel ON regCall.id = argSpecLabel.call_id
		AND argSpecLabel.keyword = 'specLabel'
	INNER JOIN uses AS genericUse ON genericUse.parent_id = ss.mod_id
	LEFT JOIN usesEntity ON usesEntity.parent_id = genericUse.id
		AND usesEntity.newName = argSpecLabel.name
INNER JOIN callArgIdent AS argSpecRoutine ON regCall.id = argSpecRoutine.call_id
	AND argSpecRoutine.keyword = 'specRoutine'
	AND argSpecRoutine.name = sm.name
LEFT JOIN callArgConst AS argSpecPhaseLabel ON regCall.id = argSpecPhaseLabel.call_id
	AND argSpecPhaseLabel.keyword = 'specPhaseLabel';
