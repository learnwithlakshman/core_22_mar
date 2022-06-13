package com.careerit.iplstats.repo;

import com.careerit.iplstats.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TeamRepo extends JpaRepository<Team,Long> {

            public Optional<Team> findByTeamCode(String teamCode);


    List<Team> findByTeamNameContains(String str);
}