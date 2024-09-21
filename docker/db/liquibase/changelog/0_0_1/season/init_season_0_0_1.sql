create table season
(
    id        serial primary key,
    name      varchar(128)             not null,
    sport_id  int references sport (id),
    starts_at timestamp with time zone not null,
    ends_at   timestamp with time zone not null
);
