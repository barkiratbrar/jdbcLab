drop database if exists JdbcLab;
create database JdbcLab;
use JdbcLab;
create table StudentManagement(
id int(255) not null,
StudentName varchar(255) not null,
age int(255) not null,
);
insert into StudentManagement (id,StudentName,age) values
("1",'Barkirat','20'),
("2",'Raman','20'),
("3",'Jasman',f'20'alse);