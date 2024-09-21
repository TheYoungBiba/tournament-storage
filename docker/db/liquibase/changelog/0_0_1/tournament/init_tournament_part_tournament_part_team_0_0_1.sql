create table tournament_part_tournament_part_team
(
    tournament_part_id      int references tournament_part (id),
    tournament_part_team_id int references tournament_part_team (id),
    result                  int,
    primary key (tournament_part_id, tournament_part_team_id)
);
