package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Team;

import java.util.List;

public interface TeamService {

        Team addTeam(Team team);
        List<Team> addTeams(List<Team> teams);
        List<Team> getTeams();
        boolean deleteTeamById(Long id);
        Team updateTeam(Team team);
        Team getTeamById(Long id);

        List<Team> search(String str);
}
