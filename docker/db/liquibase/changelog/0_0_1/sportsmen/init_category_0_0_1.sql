create table category
(
    id       int primary key,
    name     varchar(64) not null,
    sport_id int references sport (id)
);
