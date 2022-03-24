package com.careerit.cj.day10;

import java.util.ArrayList;
import java.util.List;

public class TeamService {

	public List<TeamDTO> getTeamDetails() {
		
		List<TeamDTO> teams = new ArrayList<>();
		List<Team> tlist = CsvReaderUtil.loadTeamDetails();
		List<Player> plist = CsvReaderUtil.loadPlayerDetails();
		for(Team team:tlist) {
			
			List<Player> list = new ArrayList<Player>();
			for(Player p:plist) {
				if(p.getTeam().equals(team.getTeam_code())) {
					list.add(p);
				}
			}
			TeamDTO teamDTO = new TeamDTO(team.getTeam_code(),team.getTeam_name(), list); 
			teams.add(teamDTO);
		}
		return teams;
	}
}
