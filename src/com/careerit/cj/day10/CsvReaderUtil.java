package com.careerit.cj.day10;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvReaderUtil {

		public static List<Team> loadTeamDetails(){
			List<Team> list = new ArrayList<>();
			try {
				List<String> dlist = Files.readAllLines(Paths.get("data/team.csv"));
				for (int i = 1; i < dlist.size(); i++) {
					String[] data = dlist.get(i).split(",");
					String team_code = data[0];
					String team_name = data[1];
					Team team = new Team(team_code, team_name);
					list.add(team);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return list;
		}
		public static List<Player> loadPlayerDetails(){
			List<Player> list = new ArrayList<Player>();
			try {
				List<String> dlist = Files.readAllLines(Paths.get("data/player_data.csv"));
				for (int i = 1; i < dlist.size(); i++) {
					String[] data = dlist.get(i).split(",");
					String name = data[0];
					String role = data[1];
					double price = Double.parseDouble(data[2]);
					String country = data[3];
					String team = data[4];
					Player player = new Player(name, role, price, country, team);
					list.add(player);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return list;
		}
}
