package com.gestion.football.controller;

import com.gestion.football.controller.response.TeamResponse;
import com.gestion.football.model.TeamEntity;
import com.gestion.football.repository.TeamRepository;
import com.gestion.football.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    private TeamService service;
    @GetMapping("/team")
    public List<TeamResponse> getall(){
        return service.getall();
    }
}
