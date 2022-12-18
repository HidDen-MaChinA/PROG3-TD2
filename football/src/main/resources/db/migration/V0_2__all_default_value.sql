insert into teams(name) values('argentine');
insert into teams(name) values('france');
insert into player(name,number,age,birthday,team) values('lionel messi',2,38,'1999-03-18',1);
insert into player(name,number,age,birthday,team) values('mbappe',18,33,'1999-12-12',2);
insert into player(name,number,age,birthday,team) values('franco',4,18,'1978-03-18',1);
insert into player(name,number,age,birthday,team) values('loffy',10,24,'1993-12-01',2);
insert into player(name,number,age,birthday,team) values('rivaldo',7,24,'1929-06-14',1);
insert into player(name,number,age,birthday,team) values('puchini',19,35,'1999-01-12',2);
insert into sponsor(name) values('qatar');
insert into sponsor(name) values('orange');
insert into have_sponsor(id_team,id_sponsor) values(1,2);
insert into have_sponsor(id_team,id_sponsor) values(2,1);
insert into matchBetween(match_date,stadium,team_1,team_2)
    values('2022-12-18','qatar',1,2);