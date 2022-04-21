package com.careerit.iplstat.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.careerit.iplstat.dto.RoleInfoDto;
import com.careerit.iplstat.dto.TeamAmountDto;
import com.careerit.iplstat.dto.TeamRoleDto;
import com.careerit.iplstat.model.Player;
import com.careerit.iplstat.model.TeamDetails;
import com.careerit.iplstat.util.CsvReaderUtil;

//TODO: implement service interface
//TODO: make IplStatServiceImpl class as singleton
public class IplStatServiceImpl implements IplStatService {

	private static volatile IplStatService obj;
	private CsvReaderUtil util = CsvReaderUtil.getInstance();

	private List<Player> players = new ArrayList<Player>();
	private List<TeamDetails> teams = new ArrayList<>();

	private Map<String, List<Player>> map = new HashMap<>();
	private Map<String, String> teamLabelMap = new HashMap<>();
	

	private IplStatServiceImpl() {
		players = util.loadPlayerFromCSV();
		teams = util.loadTeamDetailsFromCSV();
		map = players.stream().collect(Collectors.groupingBy(Player::getTeamLabel));
		for(TeamDetails team:teams) {
			teamLabelMap.put(team.getTeamLabel(), team.getTeamName());
		}

	}

	public static IplStatService getInstance() {
		if (obj == null) {
			synchronized (IplStatServiceImpl.class) {
				if (obj == null) {
					obj = new IplStatServiceImpl();
				}
			}
		}
		return obj;
	}

	@Override
	public List<Player> getPlayerOf(String teamLabel) {
		if (map.get(teamLabel) == null) {
			throw new IllegalArgumentException("Invalid team label please provide valid teamname");
		}
		return map.get(teamLabel);
	}

	@Override
	public List<TeamAmountDto> getTeamAmountDetails() {
		List<TeamAmountDto> list = new ArrayList<TeamAmountDto>();
		map.entrySet().forEach(entry -> {
			String teamLabel = entry.getKey();
			double totalAmount = entry.getValue().stream().mapToDouble(p -> p.getPrice()).sum();
			TeamAmountDto obj = new TeamAmountDto();
			obj.setTeamLabel(teamLabel);
			obj.setTeamName(teamLabelMap.get(teamLabel));
			obj.setTotalAmount(totalAmount);
			list.add(obj);
		});
		return list;
	}

	@Override
	public TeamRoleDto getTeamRoleDetailsOf(String teamLabel) {
		Optional<TeamDetails> optTeam = teams.stream().filter(t -> t.getTeamLabel().equals(teamLabel)).findFirst();
		TeamRoleDto obj = new TeamRoleDto();
		if (optTeam.isPresent()) {
			TeamDetails team = optTeam.get();
			List<Player> list = map.get(teamLabel);
			Map<String, Integer> roleCountMap = new HashMap<String, Integer>();
			for (Player p : list) {
				roleCountMap.putIfAbsent(p.getRole(), 0);
				roleCountMap.put(p.getRole(), roleCountMap.get(p.getRole()) + 1);
			}
			obj.setTeamLabel(team.getTeamLabel());
			obj.setTeamName(team.getTeamName());
			List<RoleInfoDto> roleList = new ArrayList<RoleInfoDto>();
			roleCountMap.entrySet().forEach(entry -> {
				RoleInfoDto ob = new RoleInfoDto();
				ob.setRoleName(entry.getKey());
				ob.setRoleCount(entry.getValue());
				roleList.add(ob);
			});
			obj.setRoleInfoList(roleList);
		}
		return obj;
	}
	@Override
	public List<Player> getMaxPaidPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

}
