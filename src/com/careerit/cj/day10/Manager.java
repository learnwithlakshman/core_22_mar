package com.careerit.cj.day10;

import java.util.List;

public class Manager {

		public static void main(String[] args) {
			
				TeamService teamService = new TeamService();
				List<TeamDTO> list = teamService.getTeamDetails();
				
				// Create string with name,role,price,country,team_code,team_name
				/*
				 * Example:
				 * Ambati Rayudu,WK-Batsman,67500000,India,CSK,Chennai Super Kings
				 * Shubman Gill,Batsman,80000000,India,GT,Gujarat Titans
				 * ......
				 */
				
		}
}
