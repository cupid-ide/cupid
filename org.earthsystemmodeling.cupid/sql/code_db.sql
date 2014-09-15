drop table if exists module;
drop table if exists call;
drop table if exists subroutine;
drop table if exists callArg;
drop sequence if exists global_fact_id;

create sequence global_fact_id;

create table module(
    id bigint default global_fact_id.nextval primary key, 
    name varchar(100));

create table subroutine(
     id bigint default global_fact_id.nextval primary key, 
     parent_id bigint,
     name varchar(100)); 

create table call(
     id bigint default global_fact_id.nextval primary key, 
     parent_id bigint,
     name varchar(100)); 
     
create table callArg(
	 id bigint default global_fact_id.nextval primary key,
	 parent_id bigint,
	 argIndex int);