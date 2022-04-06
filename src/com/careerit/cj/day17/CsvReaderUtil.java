package com.careerit.cj.day17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class CsvReaderUtil {

	private CsvReaderUtil() {
	}

	public static List<Player> loadPlayers() {
		List<Player> list = new ArrayList<>();
		try {
			List<String> lines = Files.readAllLines(Paths.get("data/player_data.csv"));
			lines = lines.subList(1, lines.size());
			for (String line : lines) {
				String[] arr = line.split(",");
				Player player = convertToPlayer(arr);
				list.add(player);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	private static Player convertToPlayer(String[] arr) {
		String name = arr[0];
		String role = arr[1];
		double price = Double.parseDouble(arr[2]);
		String country = arr[3];
		String teamCode = arr[4];
		Player player = new Player(name, role, teamCode, country, price);
		return player;
	}

	
}
