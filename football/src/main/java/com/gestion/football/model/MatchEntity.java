package com.gestion.football.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "matchbetween")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MatchEntity{
    @Id
    private long id_match;
    private Date match_date;
    private String beginning;
    private String stadium;
    @OneToOne
    @JoinColumn(name = "team_1",referencedColumnName = "id_team")
    private TeamEntity team_1;
    @OneToOne
    @JoinColumn(name = "team_2",referencedColumnName = "id_team")
    private TeamEntity team_2;
}
