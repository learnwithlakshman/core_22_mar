package com.careerit.cj.day11;

public class Account {

		private long accNumber;
		private String name;
		private double balance;
		
				
		public Account(long accNumber, String name, double balance) {
			this.accNumber = accNumber;
			this.name = name;
			this.balance = balance;
		}

		public void withDraw(double amount) {
			if(balance >= amount) {
				balance -= amount;
			}
		}
		public void deposit(double amount) {
			balance += amount;
		}
		public void showInfo() {
			System.out.println("Account :"+accNumber);
			System.out.println("Name    :"+name);
			System.out.println("Balance :"+balance);
		}
		public double getBalance() {
			return balance;
		}
		public long getAccNumber() {
			return accNumber;
		}
		public String getName() {
			return name;
		}
		
}
