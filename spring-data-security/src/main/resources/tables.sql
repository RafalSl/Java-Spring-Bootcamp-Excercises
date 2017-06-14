drop table if exists authorities;
drop table if exists users;

create table users (
username varchar(45) not null,
password varchar(45) not null,
enabled tinyint not null default 1,
primary key (username));

create table authorities (
user_role_id int(11) not null auto_increment,
username varchar(45) not null,
authority varchar(45) not null,
primary key (user_role_id),
unique key uni_username_role (authority, username),
key fk_username_idx (username),
constraint fk_username foreign key (username) references users (username));