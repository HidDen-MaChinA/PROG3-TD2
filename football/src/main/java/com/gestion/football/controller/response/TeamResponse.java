package com.gestion.football.controller.response;

import com.gestion.football.model.PlayerEntity;
import com.gestion.football.model.SponsorEntity;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamResponse {
    private long id;
    private String name;
    private List<PlayerResponse> member;
    private List<SponsorEntity> sponsor;
}
