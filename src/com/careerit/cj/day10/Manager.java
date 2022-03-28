package com.careerit.cj.day10;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
				StringBuilder sb = new StringBuilder();
				for(TeamDTO teamDTO:list) {
					for(Player p:teamDTO.getPlayers()) {
						double dd = new BigDecimal(p.getPrice()).doubleValue();
						String str = String.format("%.2f", dd);
						sb.append(p.getName()).append(",").append(p.getRole()).append(",").append(str)
						.append(",")
						.append(p.getCountry()).append(",").append(teamDTO.getTeam_code())
						.append(",").append(teamDTO.getTeam_name())
						.append("\n");
					}
				}
				System.out.println(sb.toString());
				withDraw("10002345","Krish",5000);
				System.out.println(maskAccount("1234567890"));
				
		}
		private static void withDraw(String accNumber,String name,double amount) {
			StringBuilder sb = new StringBuilder();
			sb.append("Customer with acc :")
			.append(accNumber)
			.append(",Name :")
			.append(name)
			.append(" and trying to with draw ").append(amount).append("  ").append(LocalDateTime.now());
			System.out.println(sb.toString());
		}
		
		private static String maskAccount(String accNumber) {
			return "XXXXXX".concat(accNumber.substring(accNumber.length()-4));
		}
}
