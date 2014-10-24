set schema prolog;

truncate table module;
truncate table call;
truncate table subroutine;
truncate table callArg;
truncate table ident;
truncate table const;
truncate table arrayConstructor;

alter sequence global_fact_id restart with 1;