package com.careerit.cj.day17;

import java.text.NumberFormat;

public class Player {

		private String name;
		private String role;
		private String country;
		private String teamCode;
		private double price;
		
		
		public Player(String name, String role, String country, String teamCode, double price) {
			this.name = name;
			this.role = role;
			this.country = country;
			this.teamCode = teamCode;
			this.price = price;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getTeamCode() {
			return teamCode;
		}
		public void setTeamCode(String teamCode) {
			this.teamCode = teamCode;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			NumberFormat nf = NumberFormat.getInstance();
			return "Player [name=" + name + ", role=" + role + ", country=" + country + ", teamCode=" + teamCode
					+ ", price=" + nf.format(price) + "]";
		}
		
		
}
