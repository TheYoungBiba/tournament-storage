create table organization
(
    id          serial primary key,
    name        varchar(256) not null,
    ogrn        varchar(15)  not null,
    reg_address varchar(256) not null,
    inn         varchar(10)  not null
);
