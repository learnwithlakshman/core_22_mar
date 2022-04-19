package com.careerit.iplstat.main;

import java.util.List;

import com.careerit.iplstat.dto.TeamAmountDto;
import com.careerit.iplstat.dto.TeamRoleDto;
import com.careerit.iplstat.model.Player;
import com.careerit.iplstat.service.IplStatService;

public class Manager {

	public static void main(String[] args) {

		IplStatService iplStatService = null;// IplStatServiceImpl.getInstance();

		List<Player> maxPaidPlayerList = iplStatService.getMaxPaidPlayers();
		// Show all max paid player(s)

		List<TeamAmountDto> teamAmountList = iplStatService.getTeamAmountDetails();
		// Show all team amount details

		List<TeamRoleDto> teamRoleList = iplStatService.getTeamRoleDetailsOf("RR");
		// Show all team amount details

		List<Player> playerList = iplStatService.getPlayerOf("RR");
		// Show all the player details

	}
}
