package com.careerit.cj.day2;

import java.util.Scanner;

public class BillAmountWithIfElse {
	// if bill amount > 500 give the 10% discount, otherwise discount would be 5%
	// bill_amount = 0;
	// discount = 0;
	// net_amount = bill_amount - discount;

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the bill amount: ");
		
		float bill_amount = sc.nextFloat();
		float discount = 0.0f;
		
		if(bill_amount > 500) {
			discount = bill_amount * 0.1f;
		}else {
			discount = bill_amount * 0.05f;
		}
		float net_amount = bill_amount - discount;
		System.out.println("Bill Amount :"+bill_amount);
		System.out.println("Discount    :"+discount);
		System.out.println("Net Amount  :"+net_amount);
		
		sc.close();
	}
}
