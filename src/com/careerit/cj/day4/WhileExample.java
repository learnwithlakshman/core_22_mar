package com.careerit.cj.day4;

public class WhileExample {

		public static void main(String[] args) {
			
				int num = 5;
				
				int res = 1;
				/*
				 * for(int i=2;i<=num;i++) { res *= i; }
				 */
				int i = 2;
				while(i<=num) {
					res *= i;
					i++;
				}
				System.out.println("Factorial of :"+num+" is "+res);
		
				/*
				 * for(int l=1;l<=10;l++) { System.out.println(num+" * "+l+" = "+(num*l)); }
				 */
				
				int l=1;
				while(l<=10) {
					System.out.println(num+" * "+l+" = "+(num*l));
					l = l + 1;
				}
				
				
		
		}
}
