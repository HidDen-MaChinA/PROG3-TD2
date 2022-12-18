create table Have_Sponsor(
    id_sponsor_team serial primary key,
    id_team integer not null constraint "fk_this_team"
        references teams(id_team),
    id_sponsor integer not null constraint "fk_have_sponsor"
        references sponsor(id_sponsor)
);