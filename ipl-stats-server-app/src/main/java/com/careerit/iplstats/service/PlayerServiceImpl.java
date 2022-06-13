package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.domain.Team;
import com.careerit.iplstats.dto.PlayerDto;
import com.careerit.iplstats.repo.PlayerRepo;
import com.careerit.iplstats.repo.TeamRepo;
import com.careerit.iplstats.service.exception.IplStatApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PlayerServiceImpl implements  PlayerService{

    @Autowired
    private PlayerRepo playerRepo;
    @Autowired
    private TeamRepo teamRepo;

    @Override
    public PlayerDto addPlayer(PlayerDto playerDto) {
        //Validation
        String teamCode=playerDto.getTeamCode();
        Optional<Team> optTeam = teamRepo.findByTeamCode(teamCode);
        if(optTeam.isPresent()){
            Player player= convertPlayerDtoToPlayer(playerDto);
            Team team = optTeam.get();
//            team.addPlayer(player);
//            teamRepo.save(team);
            player.setTeam(team);
            Player savedPlayer=playerRepo.save(player);
            playerDto = convertPlayerToPlayerDto(player);
            playerDto.setTeamCode(team.getTeamCode());
            return playerDto;
            
        }
        log.error("Team code :{} is not found",teamCode);
        throw new IplStatApiException("Team with code "+teamCode+" is not found");
    }



    @Override
    public List<PlayerDto> addPlayers(List<PlayerDto> players) {
        return null;
    }
    private Player convertPlayerDtoToPlayer(PlayerDto playerDto) {

                Player player = new Player();
                player.setName(playerDto.getName());
                player.setId(playerDto.getId());
                player.setAmount(playerDto.getAmount());
                player.setCountry(playerDto.getCountry());
                player.setRole(playerDto.getRole());
                return player;
    }

    private PlayerDto convertPlayerToPlayerDto(Player player) {

        PlayerDto playerdto = new PlayerDto();
        playerdto.setName(player.getName());
        playerdto.setId(player.getId());
        playerdto.setAmount(player.getAmount());
        playerdto.setCountry(player.getCountry());
        playerdto.setRole(player.getRole());
        return playerdto;
    }
}
