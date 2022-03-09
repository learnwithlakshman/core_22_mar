package com.careerit.cj.day2;

import java.util.Scanner;

public class BillCalculatorWithCard {

	
		// If bill amount is > 500 or paying by card 10% otherwise 2%
	
		public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Payment mode (cash or card) ?");
			String pmode = sc.nextLine();

			System.out.println("Enter the bill amount: ");
			float bill_amount = sc.nextFloat();
			
			float discount = 0.0f;
			
			if(bill_amount > 500 || pmode.equals("card")) {
				discount = bill_amount * 0.1f;
			}else {
				discount = bill_amount * 0.02f;
			}
			float net_amount = bill_amount - discount;
			System.out.println("Bill Amount  :"+bill_amount);
			System.out.println("Payment mode :"+pmode);
			System.out.println("Discount     :"+discount);
			System.out.println("Net Amount   :"+net_amount);
			
			sc.close();
		}
	
		
}
