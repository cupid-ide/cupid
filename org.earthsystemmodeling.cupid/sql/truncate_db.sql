set schema prolog;

truncate table tokenRef;
truncate table module;
truncate table uses;
truncate table usesEntity;
truncate table call;
truncate table subroutine;
truncate table param;
truncate table callArg;
truncate table ident;
truncate table const;
truncate table arrayConstructor;

alter sequence global_fact_id restart with 1;