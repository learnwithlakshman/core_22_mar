package com.careerit.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class TeamStatsManager {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);;
		try {
			List<Team> list = mapper.readValue(TeamStatsManager.class.getResourceAsStream("/json/teams.json"),
					new TypeReference<List<Team>>() {
					});

			List<TeamStatDto> teamList = new ArrayList<TeamStatDto>();
			list.stream().forEach(t -> {
				TeamStatDto teamStatDto = getTeamStatDto(t.getLabel(), t.getPlayers());
				teamList.add(teamStatDto);
			});
			
			mapper.writeValue(new File("team_stat_with_roles.json"), teamList);
			
			// Total amount, average amount, count

			List<Player> players = list.stream().flatMap(t -> t.getPlayers().stream()).collect(Collectors.toList());
			double totalAmount = players.stream().mapToDouble(p -> p.getPrice()).sum();
			int count = players.size();
			double avgAmount = totalAmount / count;

			System.out.println("Total Amount :" + totalAmount);
			System.out.println("Count        :" + count);
			System.out.println("Average      :" + avgAmount);

			mapper.writeValue(new File("ipl_team.json"), list);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static TeamStatDto getTeamStatDto(String teamName, List<Player> players) {
		TeamStatDto dto = new TeamStatDto();
		dto.setTeamName(teamName);
		dto.setCount(players.size());
		double sum = players.stream().mapToDouble(p -> p.getPrice()).sum();
		dto.setTotalAmount(sum);
		dto.setPlayerNames(players.stream().map(p->p.getName()).collect(Collectors.toList()));
		List<RoleDto> list = new ArrayList<RoleDto>();
		/*
		 * players.stream().collect(Collectors.toMap(Player::getRole,)).forEach((k,v)->{
		 * RoleDto obj = new RoleDto(); obj.setRoleName(k); obj.setCount(v); });
		 */
		Map<String, Integer> map = new HashMap<>();
		for (Player player : players) {
			map.putIfAbsent(player.getRole(), 0);
			map.put(player.getRole(), map.get(player.getRole()) + 1);
		}
		map.entrySet().forEach(e -> {
			RoleDto roleDto = new RoleDto();
			roleDto.setRoleName(e.getKey());
			roleDto.setCount(e.getValue());
			list.add(roleDto);
		});
		dto.setRoles(list);
		return dto;
	}
}
