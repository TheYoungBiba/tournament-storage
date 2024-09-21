create table season_tournament_club
(
    id                   serial primary key,
    season_tournament_id int references season_tournament (id),
    tournament_part_id   int references tournament_part (id),
    club_id              int references club (id)
);
