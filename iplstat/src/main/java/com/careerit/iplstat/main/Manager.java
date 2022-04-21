package com.careerit.iplstat.main;

import java.util.List;

import com.careerit.iplstat.dto.RoleInfoDto;
import com.careerit.iplstat.dto.TeamAmountDto;
import com.careerit.iplstat.dto.TeamRoleDto;
import com.careerit.iplstat.model.Player;
import com.careerit.iplstat.service.IplStatService;
import com.careerit.iplstat.service.IplStatServiceImpl;

public class Manager {

	public static void main(String[] args) {

		IplStatService iplStatService = IplStatServiceImpl.getInstance();// IplStatServiceImpl.getInstance();

		List<Player> maxPaidPlayerList = iplStatService.getMaxPaidPlayers();
		// Show all max paid player(s)

		List<TeamAmountDto> teamAmountList = iplStatService.getTeamAmountDetails();
		// Show all team amount details

		TeamRoleDto teamRoleDetails = iplStatService.getTeamRoleDetailsOf("RR");
		System.out.println(teamRoleDetails.getTeamLabel()+" "+teamRoleDetails.getTeamName());
		for(RoleInfoDto obj :teamRoleDetails.getRoleInfoList()) {
			System.out.println(obj.getRoleName()+"    :"+obj.getRoleCount());
		}
		

		List<Player> playerList = iplStatService.getPlayerOf("RR");
		// Show all the player details

	}
}
