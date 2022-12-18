package com.gestion.football.controller.response;

import com.gestion.football.model.TeamEntity;
import lombok.*;

import java.sql.Date;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MatchResponse {
    private long id;
    private Date date;
    private String beginning;
    private TeamResponse team_one;
    private TeamResponse team_two;
}
