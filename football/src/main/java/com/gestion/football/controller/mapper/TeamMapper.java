package com.gestion.football.controller.mapper;

import com.gestion.football.controller.response.PlayerResponse;
import com.gestion.football.controller.response.TeamResponse;
import com.gestion.football.model.PlayerEntity;
import com.gestion.football.model.TeamEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
@Getter
@Setter
@NoArgsConstructor
public class TeamMapper {
    public List<PlayerEntity> sort(List<PlayerEntity> toSort){
        return toSort.stream().sorted((playerEntity, t1) -> playerEntity.getNumber()- t1.getNumber()).toList();
    }
    @Autowired
    private PlayerMapper mapper;
    public TeamResponse Torest(TeamEntity toRefactor){
        return TeamResponse.builder()
                .id(toRefactor.getId_team())
                .name(toRefactor.getName())
                .sponsor(toRefactor.getSponsor())
                .member(this.sort(toRefactor.getMember()).stream().map(mapper::Torest).toList())
                .build();
    }
}
