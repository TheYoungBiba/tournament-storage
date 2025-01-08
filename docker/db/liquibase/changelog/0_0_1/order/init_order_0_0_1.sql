create table orders
(
    id serial primary key,
    sportsmen_id int references sportsmen (id),
    tournament_id int references tournament (id),
    is_approved boolean
);