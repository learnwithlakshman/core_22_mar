create table team(team_label varchar(200), team_name varchar(200) not null,primary key(team_label));
create table player(id int primary key auto_increment,name varchar(200),player_role varchar(200),price float,country varchar(200),team_label varchar(200),
foreign key(team_label) references team(team_label)
);