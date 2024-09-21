create table sportsmen_sport
(
    id           serial primary key,
    sport_id     int references sport (id),
    sportsmen_id int references sportsmen (id),
    category_id  int,
    role_id      int,
    rank         varchar(64),
    license      varchar(128),
    rating       real not null
);
