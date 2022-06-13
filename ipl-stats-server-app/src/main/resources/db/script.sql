use lwl_db;

drop table IF EXISTS team ;

CREATE TABLE team(id SERIAL primary key,
team_code varchar(10) unique,
team_name varchar(100));

drop table IF EXISTS player ;

CREATE TABLE player(id SERIAL primary key,
name varchar(100),
role varchar(100),
country varchar(100),
amount float,
team_id int,
foreign key(team_id) references team(id));