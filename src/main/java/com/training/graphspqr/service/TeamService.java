package com.training.graphspqr.service;

import com.training.graphspqr.domain.Team;
import com.training.graphspqr.repository.TeamRepository;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@GraphQLApi
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    @GraphQLQuery(name = "findTeam", description = "팀 하나를 찾는다")
    public Team findTeamById(Long id) {
        return teamRepository.findById(id).orElse(null);
    }
}
