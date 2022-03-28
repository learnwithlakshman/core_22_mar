package com.careerit.cj.day11;

public class Manager {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Krish", 50000);
		Account ac2 =  new Account(1002, "Maonoj", 40000);
		Account ac9 =  new Account(1003, "Charan", 30000);
		Account acc4 = new Account(1004, "Kiran", 10000);
		Account abc5 = new Account(1005, "Krishna", 10000);

		Account[] arr = new Account[] { acc1, ac2, ac9, acc4, abc5 };
		// If balance > 10000 charge them 1000 as fee
		for (Account ele : arr) {
			if (ele.getBalance() > 10000) {
				ele.withDraw(1000);
			}
		}
		
		for(Account acc:arr) {
			System.out.println(acc.getAccNumber()+" - "+acc.getBalance());
		}

	}
}
