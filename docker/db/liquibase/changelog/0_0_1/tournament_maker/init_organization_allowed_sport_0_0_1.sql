create table organization_allowed_sport
(
    organization_id int references organization (id),
    sport_id        int references sport (id),
    primary key (organization_id, sport_id)
);
