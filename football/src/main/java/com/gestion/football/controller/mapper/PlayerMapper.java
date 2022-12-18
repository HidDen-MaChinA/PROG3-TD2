package com.gestion.football.controller.mapper;

import com.gestion.football.controller.response.PlayerResponse;
import com.gestion.football.controller.response.TeamResponse;
import com.gestion.football.model.PlayerEntity;
import com.gestion.football.model.TeamEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class PlayerMapper {
    public PlayerResponse Torest(PlayerEntity toRefactor){
        return PlayerResponse.builder()
                .id(toRefactor.getId_player())
                .name(toRefactor.getName())
                .build();
    }
}
