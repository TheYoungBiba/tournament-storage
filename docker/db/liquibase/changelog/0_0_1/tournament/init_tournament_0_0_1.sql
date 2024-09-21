create table tournament
(
    id                 serial primary key,
    name               varchar(256)             not null,
    sport_id           int references sport (id),
    place              varchar(256)             not null,
    start_time         timestamp with time zone not null,
    end_time           timestamp with time zone,
    is_official        boolean                  not null,
    participation_fee  decimal                  not null,
    contacts           varchar(128),
    max_count_commands int
);
