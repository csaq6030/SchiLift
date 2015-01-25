# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table lift (
  id                        integer not null,
  name                      varchar(255),
  type                      varchar(255),
  height                    double,
  capacity                  integer,
  constraint pk_lift primary key (id))
;

create table user (
  name                      varchar(255) not null,
  pwd                       varchar(255),
  constraint pk_user primary key (name))
;

create sequence lift_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists lift;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists lift_seq;

drop sequence if exists user_seq;

