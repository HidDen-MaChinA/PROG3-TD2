package com.gestion.football.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "teams")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_team;
    private String name;
    @OneToMany(mappedBy = "team")
    private List<PlayerEntity> member;
    @ManyToMany(mappedBy = "team_sponsorized")
    private List<SponsorEntity> sponsor;
}
