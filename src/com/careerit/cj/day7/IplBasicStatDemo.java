package com.careerit.cj.day7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

public class IplBasicStatDemo {

	public static void main(String[] args) {

		String data = "GLN-24-M,ALN-37-M,GVR-45-F,KVR-23-F,MVN-35-M";
		String[] arr = data.split(",");
		int[] ageArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int age = Integer.parseInt(arr[i].split("-")[1]);
			ageArr[i] = age;
		}
		System.out.println(Arrays.toString(ageArr));
		System.out.println("IPL 2022 total amount:"+NumberFormat.getInstance().format(totalAmount()));
		totalAmount();
	}
	private static double totalAmount() {
			double amount = 0;
			String[] arr = playerData();
		    // Logic to find total amount of all the players
			for(String data:arr) {
				amount += Double.parseDouble(data.split(",")[2]);
			}
			return amount;

	}
	
	private static double totalAmount(String teamName) {
		double amount = 0;
		String[] arr = playerData();
	    // Logic to find total amount of all the players
		for(String data:arr) {
			String[] parr = data.split(",");
			if(parr[4].equals(teamName)) {
				amount += Double.parseDouble(parr[2]);
			}
		}
		return amount;
	}
	private static double totalAmountBy(String roleName) {
		return 0;
	}
	private static int playerCount(String teamName) {
		return 0;
	}
	private static double averagePrice(String roleName) {
		return 0;
	}

	private static String[] playerData() {
		String[] arr = null;
		try {
			List<String> list = Files.readAllLines(Paths.get("ipl_2022_data.csv"));
			list = list.subList(1, list.size());
			arr = new String[list.size()];
			int i = 0;
			for (String ele : list) {
				arr[i++] = ele;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;
	}
}
