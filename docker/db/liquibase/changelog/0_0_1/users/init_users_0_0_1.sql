create table users
(
    id           serial primary key,
    login        varchar(128) not null unique,
    email        varchar(128) not null unique,
    phone_number varchar(12)  not null unique,
    photo_id     varchar(1024),
    first_name   varchar(64),
    last_name    varchar(64),
    patronymic   varchar(64),
    passport_id  int references passport (id),
    password     varchar(256) not null
);
