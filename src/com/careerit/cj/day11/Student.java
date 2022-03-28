package com.careerit.cj.day11;

public class Student {

	private long regno;
	private String name;
	private int std;

	public Student(long regno, String name, int std) {
		this.regno = regno;
		this.name = name;
		this.std = std;
	}

	public void promote(int num) {
		std += num;
	}

	public void showInfo() {
		System.out.println(String.format("%s - %s - %s", regno, name, std));
	}
	
	public int getStd() {
		return std;
	}

}
