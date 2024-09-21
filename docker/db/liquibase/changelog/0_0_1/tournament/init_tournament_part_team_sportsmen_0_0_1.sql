create table tournament_part_team_sportsmen
(
    sportsmen_id            int references sportsmen (id),
    tournament_part_team_id int references tournament_part_team (id),
    primary key (sportsmen_id, tournament_part_team_id)
);
