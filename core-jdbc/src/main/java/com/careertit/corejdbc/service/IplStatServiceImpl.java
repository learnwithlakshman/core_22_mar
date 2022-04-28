package com.careertit.corejdbc.service;

import java.util.List;

import com.careerit.iplstat.dto.TeamRoleDto;
import com.careertit.corejdbc.dto.TeamAmountDto;
import com.careertit.corejdbc.dto.TeamStatsDto;
import com.careertit.corejdbc.model.Player;
import com.careertit.corejdbc.util.ConnectionUtil;

public class IplStatServiceImpl implements IplStatService {
	
	private ConnectionUtil conUtil = ConnectionUtil.obj;
	
	@Override
	public List<Player> getPlayerOf(String teamLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamAmountDto> getTeamAmountDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamRoleDto getTeamRoleDetailsOf(String teamLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getMaxPaidPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamStatsDto> getTeamStats(String teamLabel) {
		// TODO Auto-generated method stub
		return null;
	}

}
