package com.gestion.football.controller;

import com.gestion.football.controller.response.MatchResponse;
import com.gestion.football.repository.MatchRepository;
import com.gestion.football.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatchController {
    @Autowired
    private MatchService matchService;
    @GetMapping("/match")
    public List<MatchResponse> ok(){
        return matchService.getMach();
    }
}
