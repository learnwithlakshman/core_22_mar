package com.careerit.cj.day8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Player {
	String name;
	String role;
	String country;
	double price;
	String team;

	public Player(String name, String role, String country, double price, String team) {
		this.name = name;
		this.role = role;
		this.country = country;
		this.price = price;
		this.team = team;
	}

	public void showInfo() {
		System.out.println(name + " " + role + " " + country + " " + price + " " + team);
	}

}

public class IplBasicStatWithClassExample {

	public static void main(String[] args) {
	}
	// Find the total amount of all the players
	private static double totalAmount() {
		double amount = 0;
		Player[] players = playerData();
		for (Player player : players) {
			amount += player.price;
		}
		return amount;
	}

	private static double maxAmount(Player[] arr) {
		double max = arr[0].price;
		for (int i = 1; i < arr.length; i++) {
			double price = arr[i].price;
			if (max < price) {
				max = price;
			}
		}
		return max;
	}

	private static int countPlayers(Player[] arr, String teamName) {
		int count = 0;
		for (Player player : arr) {
			if (player.team.equalsIgnoreCase(teamName)) {
				count++;
			}
		}
		return count;
	}

	private static Player[] getMaxPaidPlayer(String teamName) {
		Player[] players = playerData();
		int count = countPlayers(players, teamName);
		Player[] teamPlayer = new Player[count];
		int i = 0;
    	for (Player p : players) {
			if (p.team.equalsIgnoreCase(teamName)) {
				teamPlayer[i++] = p;
			}
		}
		double max = maxAmount(teamPlayer);
		Player[] maxAmountPlayers = new Player[count];

		i = 0;
		for (Player p : teamPlayer) {
			if (p.price == max) {
				maxAmountPlayers[i++] = p;
			}
		}
		Player[] temp = new Player[i];
		System.arraycopy(maxAmountPlayers, 0, temp, 0, i);
		return temp;
	}

	private static double totalAmount(String teamName) {
		Player[] arr = playerData();
		double amount = 0;
		for (Player player : arr) {
			if (player.team.equalsIgnoreCase(teamName)) {
				amount += player.price;
			}
		}
		return amount;

	}

	private static double totalAmountBy(String roleName) {
		Player[] arr = playerData();
		double amount = 0;
		for (Player player : arr) {
			if (player.role.equalsIgnoreCase(roleName)) {
				amount += player.price;
			}
		}
		return amount;
	}

	private static int playerCount(String teamName) {
		Player[] arr = playerData();
		int count = 0;
		for (Player player : arr) {
			if (player.team.equalsIgnoreCase(teamName)) {
				count++;
			}
		}
		return count;
	}

	private static double averagePrice(String roleName) {
		Player[] arr = playerData();
		double amount = 0;
		int count = 0;
		for (Player player : arr) {
			if (player.role.equalsIgnoreCase(roleName)) {
				amount += player.price;
				count++;
			}
		}
		return count != 0 ? amount / count : 0;

	}

	private static Player[] playerData() {
		Player[] arr = null;
		try {
			List<String> list = Files.readAllLines(Paths.get("ipl_2022_data.csv"));
			list = list.subList(1, list.size());
			arr = new Player[list.size()];
			int i = 0;
			for (String ele : list) {
				String[] darr = ele.split(",");
				String name = darr[0];
				String role = darr[1];
				double price = Double.parseDouble(darr[2]);
				String country = darr[3];
				String team = darr[4];
				arr[i++] = new Player(name, role, country, price, team);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;
	}
}
