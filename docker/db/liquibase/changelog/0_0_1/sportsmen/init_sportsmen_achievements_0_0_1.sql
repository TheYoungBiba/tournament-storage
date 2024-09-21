create table sportsmen_achievements
(
    id                        serial primary key,
    sportsmen_sport_id        int references sportsmen_sport (id),
    place                     int        not null,
    tournament_id             int,
    achieved_with_category_id int,
    description               varchar(256),
    achieved_at_year          varchar(4) not null
);
