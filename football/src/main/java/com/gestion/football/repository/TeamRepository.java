package com.gestion.football.repository;

import com.gestion.football.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity,Long> {
}
