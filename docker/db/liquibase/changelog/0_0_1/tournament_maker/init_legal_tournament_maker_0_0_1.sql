create table legal_tournament_maker
(
    id              int references users (id) primary key,
    organization_id int references organization (id)
);
