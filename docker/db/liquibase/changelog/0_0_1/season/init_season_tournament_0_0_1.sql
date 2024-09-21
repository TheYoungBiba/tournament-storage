create table season_tournament
(
    id            serial primary key,
    season_id     int references season (id),
    tournament_id int references tournament (id)
);
