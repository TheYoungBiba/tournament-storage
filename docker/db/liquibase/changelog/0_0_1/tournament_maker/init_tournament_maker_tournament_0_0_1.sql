create table tournament_maker_tournament
(
    tournament_id       int references tournament (id),
    tournament_maker_id int references users (id),
    primary key (tournament_id, tournament_maker_id)
);
