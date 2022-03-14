package com.careerit.cj.day5;

import java.util.Scanner;

public class SwichCaseExample {

		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("1.Factorial 2. IsPrime 3. Prime Count b/w lb and ub 4.Reverse 5.Sum of digits 6.exit");
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println("Enter your choice :");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter the num to find factorial :");
					int num1 = sc.nextInt();
					int res = factorial(num1);
					System.out.println("Factorial of "+num1+" is "+res);
					break;
					
				default:
					break;
				}
			
			}
		}
		
		
		private static int factorial(int num) {
			int res = 1;
			for(int i=2;i<=num;i++) {
				res *= i;
			}
			return res;
		}
		private static boolean isPrime(int num) {
			return false;
		}
		private static int primeCount(int lb,int ub) {
			return 0;
		}
		private static int reverse(int num) {
			return 0;
		}
		private static int sumOfDigits(int num) {
			return 0;
		}
}
