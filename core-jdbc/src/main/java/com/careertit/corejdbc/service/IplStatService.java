package com.careertit.corejdbc.service;

import java.util.List;

import com.careerit.iplstat.dto.TeamRoleDto;
import com.careertit.corejdbc.dto.TeamAmountDto;
import com.careertit.corejdbc.dto.TeamStatsDto;
import com.careertit.corejdbc.model.Player;

public interface IplStatService {

		public List<Player> getPlayerOf(String teamLabel);
		public List<TeamAmountDto> getTeamAmountDetails();
		public TeamRoleDto getTeamRoleDetailsOf(String teamLabel);
		public List<Player> getMaxPaidPlayers();
		public List<TeamStatsDto> getTeamStats(String teamLabel);
}
