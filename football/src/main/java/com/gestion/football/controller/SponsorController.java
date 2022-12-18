package com.gestion.football.controller;

import com.gestion.football.model.SponsorEntity;
import com.gestion.football.repository.SponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SponsorController {
    @Autowired
    private SponsorRepository repository;

    @GetMapping("/sponsor")
    public List<SponsorEntity> ok(){
        return repository.findAll();
    }
}
