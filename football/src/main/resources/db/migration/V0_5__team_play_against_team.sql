create table Matchbetween(
    id_match serial primary key,
    match_date date,
    beginning VARCHAR(5),
    stadium VARCHAR(50),
    team_1 int constraint "fk_team_1" references teams(id_team),
    team_2 int constraint "fk_team_2" references teams(id_team)
)