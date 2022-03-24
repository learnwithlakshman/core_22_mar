package com.careerit.cj.day10;

import java.util.List;

public class TeamDTO {
	
	private String team_code;
	private String team_name;
	private List<Player> players;
	
	public TeamDTO(String team_code, String team_name, List<Player> players) {
		super();
		this.team_code = team_code;
		this.team_name = team_name;
		this.players = players;
	}
	public String getTeam_code() {
		return team_code;
	}
	public void setTeam_code(String team_code) {
		this.team_code = team_code;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	
}
