package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Team;
import com.careerit.iplstats.repo.TeamRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TeamServiceImpl implements  TeamService{
    @Autowired
    private TeamRepo teamRepo;
    @Override
    public Team addTeam(Team team) {
        Assert.notNull(team,"Team can't be null");
        Assert.notNull(team.getTeamCode(),"Team code can't be empty or null");
        Assert.notNull(team.getTeamName(),"Team name can't be empty or null");
        log.info("Team with team code {} is requested save",team.getTeamCode());
        team = teamRepo.save(team);
        log.info("Team is added with id :{} and team code :{}",team.getId(),team.getTeamCode());
        return team;
    }

    @Override
    public List<Team> addTeams(List<Team> teams) {
        log.info("Teams count {} is requested for save",teams.size());
        teams = teamRepo.saveAll(teams);
        log.info("Total {} teams are added",teams.size());
        return teams;
    }

    @Override
    public List<Team> getTeams() {
        List<Team> teams = teamRepo.findAll();
        log.info("Total {} teams found in database",teams.size());
        return teams;
    }

    @Override
    public boolean deleteTeamById(Long id) {
        Optional<Team> optTeam = teamRepo.findById(id);
        if(optTeam.isPresent()) {
            Team team = optTeam.get();
            log.info("Team with id {} and team code {} is going delete",team.getId(),team.getTeamCode());
            teamRepo.delete(team);
            return true;
        }
        String errorMsg = String.format("Team with id "+id+" is not found");
        log.error(errorMsg);
        throw new IllegalArgumentException(errorMsg);
    }

    @Override
    public Team updateTeam(Team team) {
        Assert.notNull(team,"Team can't be null");
        Assert.notNull(team.getId(),"Team id can't be empty or null");
        Assert.notNull(team.getTeamCode(),"Team code can't be empty or null");
        Assert.notNull(team.getTeamName(),"Team name can't be empty or null");
        log.info("Team with team code {} is requested for update",team.getTeamCode());
        team = teamRepo.save(team);
        log.info("Team is updated with id :{} and team code :{}",team.getId(),team.getTeamCode());
        return team;
    }

    @Override
    public Team getTeamById(Long id) {
        Optional<Team> optTeam = teamRepo.findById(id);
        if(optTeam.isPresent()) {
            Team team = optTeam.get();
            log.info("Team with id {} and team code {}",team.getId(),team.getTeamCode());
            return team;
        }
        String errorMsg = String.format("Team with id "+id+" is not found");
        log.error(errorMsg);
        throw new IllegalArgumentException(errorMsg);

    }

    @Override
    public List<Team> search(String str) {
       return teamRepo.findByTeamNameContains(str);
    }
}
