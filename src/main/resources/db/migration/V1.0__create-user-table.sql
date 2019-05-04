-- auto-generated definition
create table user
(
    id       int auto_increment
        primary key,
    account  varchar(255) not null,
    password varchar(255) not null,
    username varchar(255) not null
);
