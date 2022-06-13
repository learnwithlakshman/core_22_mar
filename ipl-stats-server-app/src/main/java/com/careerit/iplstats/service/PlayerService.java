package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.PlayerDto;

import java.util.List;

public interface PlayerService {

        public PlayerDto addPlayer(PlayerDto playerDto);
        public List<PlayerDto> addPlayers(List<PlayerDto> players);
}
