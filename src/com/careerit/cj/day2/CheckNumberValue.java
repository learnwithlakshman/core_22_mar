package com.careerit.cj.day2;

import java.util.Scanner;

public class CheckNumberValue {
		// num -> num < 0 make that number as +ve number otherwise display entered number
			
		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the num :");
				int num = sc.nextInt();
				
				if(num < 0) {
					num = -num;
				}
				
				System.out.println("You entered num :"+num);
				sc.close();
				
				
				
		}
}
