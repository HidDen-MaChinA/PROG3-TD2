create table player(
    id_player serial primary key,
    name varchar(250),
    number int,
    age integer,
    birthday date,
    team integer not null constraint "fk_players_team" references teams(id_team)
);