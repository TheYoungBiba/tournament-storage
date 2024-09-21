create table sportsmen_sanction
(
    sportsmen_id     int references sportsmen (id) primary key,
    sanction_id      int references sanction (id),
    received_in      date,
    disqualification date
);
