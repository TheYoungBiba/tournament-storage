create table sanction
(
    id       serial primary key,
    name     varchar(128) not null,
    sport_id int references sport (id)
);
