package com.careerit.iplstat.service;

import java.util.List;

import com.careerit.iplstat.dto.TeamAmountDto;
import com.careerit.iplstat.dto.TeamRoleDto;
import com.careerit.iplstat.model.Player;

public interface IplStatService {

		public List<Player> getPlayerOf(String teamLabel);
		public List<TeamAmountDto> getTeamAmountDetails();
		public TeamRoleDto getTeamRoleDetailsOf(String teamLabel);
		public List<Player> getMaxPaidPlayers();
}
