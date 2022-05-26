create table product(
   pid int primary key auto_increment,
   name varchar(200) not null,
   price double(38,15) not null,
   discount double(38,15),
   quantity int not null
);