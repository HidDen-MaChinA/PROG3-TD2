package com.gestion.football.repository;

import com.gestion.football.model.SponsorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorRepository extends JpaRepository<SponsorEntity,Long> {
}
