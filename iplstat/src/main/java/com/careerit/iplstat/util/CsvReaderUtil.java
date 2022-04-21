package com.careerit.iplstat.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.careerit.iplstat.model.Player;
import com.careerit.iplstat.model.TeamDetails;

public class CsvReaderUtil {

	private volatile static CsvReaderUtil obj = null;

	private CsvReaderUtil() {

	}

	public static CsvReaderUtil getInstance() {
		if (obj == null) {
			synchronized (CsvReaderUtil.class) {
				if (obj == null) {
					obj = new CsvReaderUtil();
				}
			}
		}
		return obj;
	}

	public List<Player> loadPlayerFromCSV() {

		String filePath = "/data/player_data.csv";
		URL uri = CsvReaderUtil.class.getResource(filePath);
		List<Player> teamDetails = new ArrayList<>();
		List<String> list;
		try {
			list = Files.readAllLines(Paths.get(uri.toURI()));
			teamDetails = list.stream().skip(1).map(line -> convertToPlayer(line)).collect(Collectors.toList());
		} catch (IOException e) {
			System.out.println("The resource is not found with name :" + filePath);
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return teamDetails;
	}

	public List<TeamDetails> loadTeamDetailsFromCSV() {

		String filePath = "/data/team.csv";
		URL uri = CsvReaderUtil.class.getResource(filePath);
		List<TeamDetails> teamDetails = new ArrayList<TeamDetails>();
		List<String> list;
		try {
			list = Files.readAllLines(Paths.get(uri.toURI()));
			teamDetails = list.stream().skip(1).map(line -> convertToTeam(line)).collect(Collectors.toList());
		} catch (IOException e) {
			System.out.println("The resource is not found with name :" + filePath);
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return teamDetails;
	}

	private Player convertToPlayer(String line) {
		String[] arr = line.split(",");
		Player player = Player.builder().name(arr[0]).role(arr[1]).price(Double.parseDouble(arr[2])).country(arr[3])
				.teamLabel(arr[4]).build();
		return player;
	}

	private TeamDetails convertToTeam(String line) {
		String[] teamData = line.split(",");
		TeamDetails obj = TeamDetails.builder().teamLabel(teamData[0]).teamName(teamData[1]).build();
		return obj;
	}

}
