package com.careerit.threads;

class Account {

	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public synchronized void withDraw(double amount) {
		System.out.println("Thread :" + Thread.currentThread().getName() + " is trying to withdraw " + amount);
		if (amount > balance) {
			try {
				System.out.println("Waiting....");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.balance -= amount;
		System.out.println("After withdraw :" + amount + " balance is :" + balance);
	}

	public synchronized void deposit(double amount) {
		System.out.println("Thread :" + Thread.currentThread().getName() + " is trying to deposit " + amount);
		this.balance += amount;
		notify();
	}

}

public class AccountManger {

	public static void main(String[] args) {
		Account acc = new Account(3000);
		Thread t1 = new Thread(() -> {
			acc.withDraw(5000);
		}, "Person-1");
		Thread t2 = new Thread(() -> {
			acc.deposit(3000);
		}, "Person-2");
		t1.start();
		t2.start();
	}
}
