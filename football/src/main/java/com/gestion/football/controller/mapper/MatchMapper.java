package com.gestion.football.controller.mapper;

import com.gestion.football.controller.response.MatchResponse;
import com.gestion.football.model.MatchEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class MatchMapper {
    @Autowired
    private TeamMapper mapper;
    public MatchResponse toRest(MatchEntity refactor){
        return MatchResponse.builder()
                .id(refactor.getId_match())
                .date(refactor.getMatch_date())
                .team_one(mapper.Torest(refactor.getTeam_1()))
                .team_two(mapper.Torest(refactor.getTeam_2()))
                .beginning(refactor.getBeginning())
                .build();
    }
}
