create schema if not exists prolog;
set schema prolog;

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
drop sequence if exists global_fact_id;

create sequence global_fact_id;

create table compilationUnit(
	id bigint default global_fact_id.nextval primary key,
	filename varchar(100),
	path varchar(1024));

create table tokenRef(
	id bigint primary key,
	filename varchar(500),
	offset int,
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
     type varchar(100),
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
