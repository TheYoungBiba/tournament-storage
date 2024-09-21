create table tournament_part_judge
(
    tournament_part_id int references tournament_part (id),
    judge_id           int references judge (id),
    judge_status_id    int references judge_status (id),
    primary key (tournament_part_id, judge_id)
);
