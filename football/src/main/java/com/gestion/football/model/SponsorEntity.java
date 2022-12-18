package com.gestion.football.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "sponsor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SponsorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_sponsor;
    private String name;
    @ManyToMany
    @JoinTable(
            name = "have_sponsor",
            joinColumns = @JoinColumn(name = "id_sponsor"),
            inverseJoinColumns = @JoinColumn(name = "id_team")
    )
    @JsonIgnore
    private List<TeamEntity> team_sponsorized;
}
 