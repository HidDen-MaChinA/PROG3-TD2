create table teams(
    id_team serial primary key,
    name varchar(250)
);
create table sponsor(
    id_sponsor serial primary key,
    name varchar(250)
);
create table player(
    id_player serial primary key,
    name varchar(250),
    number int,
    age integer,
    birthday date,
    team integer not null constraint "fk_players_team" references teams(id_team)
);
create table Have_Sponsor(
    id_sponsor_team serial primary key,
    id_team integer not null constraint "fk_this_team"
        references teams(id_team),
    id_sponsor integer not null constraint "fk_have_sponsor"
        references sponsor(id_sponsor)
);
create table Matchbetween(
    id_match serial primary key,
    match_date date,
    beginning VARCHAR(5),
    stadium VARCHAR(50),
    team_1 int constraint "fk_team_1" references teams(id_team),
    team_2 int constraint "fk_team_2" references teams(id_team)
)