package com.gestion.football.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "player")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_player;
    private String name;
    private int age;
    private int number;
    private Date birthday;
    @ManyToOne
    @JoinColumn(name = "team",referencedColumnName = "id_team")
    @JsonIgnore
    private TeamEntity team;
}
