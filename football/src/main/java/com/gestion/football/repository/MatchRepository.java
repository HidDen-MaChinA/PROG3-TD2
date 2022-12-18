package com.gestion.football.repository;

import com.gestion.football.model.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<MatchEntity,Long> {
}
