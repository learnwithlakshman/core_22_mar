package com.careerit.cj.day12;

import java.io.IOException;

public class Account {

		private String accNumber;
		private String name;
		private String email;
		private String mobile;
		private double balance;
		
		public Account(String name, String mobile, double balance) {
			this(name,"N/A", mobile, balance);
		}
		public Account(String name, String email, String mobile, double balance) {
			this.accNumber = AccNumberUtil.getNewAccountNumber();
			this.name = name;
			this.email = email;
			this.mobile = mobile;
			this.balance = balance;
		}
		
		public  void withDraw(double amount) {
			
		}
		
		public String getAccNumber() {
			return accNumber;
		}
		public String getName() {
			return name;
		}
		public String getEmail() {
			return email;
		}
		public String getMobile() {
			return mobile;
		}
		public double getBalance() {
			return balance;
		}
		
		
		
		
}
