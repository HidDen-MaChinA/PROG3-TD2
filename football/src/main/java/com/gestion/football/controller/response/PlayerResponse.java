package com.gestion.football.controller.response;

import jdk.jfr.Name;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerResponse {
    private long id;
    private String name;
}
