package com.careerit.cj.day20;

public class CountryStatDto {

	private String country;
	private int count;
	private double avgSalary;

	public String getCountry() {
		return country;
	}

	public CountryStatDto() {
		super();
	}

	public CountryStatDto(String country, int count, double avgSalary) {
		super();
		this.country = country;
		this.count = count;
		this.avgSalary = avgSalary;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getAvgSalary() {
		return avgSalary;
	}

	public void setAvgSalary(double avgSalary) {
		this.avgSalary = avgSalary;
	}

}
