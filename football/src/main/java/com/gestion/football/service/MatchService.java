package com.gestion.football.service;

import com.gestion.football.controller.mapper.MatchMapper;
import com.gestion.football.controller.response.MatchResponse;
import com.gestion.football.repository.MatchRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Service
public class MatchService {
    @Autowired
    private MatchMapper mapper;
    @Autowired
    private MatchRepository repository;
    public List<MatchResponse> getMach(){
        return repository.findAll().stream().map(mapper::toRest).toList();
    }
}
