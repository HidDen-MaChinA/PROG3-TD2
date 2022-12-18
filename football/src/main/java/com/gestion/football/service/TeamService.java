package com.gestion.football.service;

import com.gestion.football.controller.mapper.TeamMapper;
import com.gestion.football.controller.response.TeamResponse;
import com.gestion.football.model.PlayerEntity;
import com.gestion.football.model.TeamEntity;
import com.gestion.football.repository.TeamRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeamService {
    @Autowired
    private TeamMapper mapper;
    @Autowired
    private TeamRepository repository;
    public List<TeamResponse> getall(){
        return repository.findAll().stream().map(mapper::Torest).toList();
    }
}
