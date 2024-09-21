create table passport
(
    id           serial primary key,
    users_id     int references users (id),
    series       varchar(4),
    number       varchar(6),
    registration varchar(256)
);
