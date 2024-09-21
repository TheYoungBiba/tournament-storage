create table tournament_part
(
    id            serial primary key,
    tournament_id int references tournament (id),
    name          varchar(256),
    start_time    timestamp with time zone,
    end_time      timestamp with time zone,
    category_id   int references category (id)
);
