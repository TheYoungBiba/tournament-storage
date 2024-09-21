create table sportsmen
(
    id                int references users (id) primary key,
    birthday          timestamp not null,
    is_male           boolean   not null,
    height            real,
    height_updated_at date,
    height_checked_at date,
    weight            real,
    weight_updated_at date,
    weight_checked_at date,
    club_id           int
);