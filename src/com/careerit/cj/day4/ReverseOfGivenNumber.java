package com.careerit.cj.day4;

public class ReverseOfGivenNumber {

		public static void main(String[] args) {
			
				int num = 785;
				
				int rev = 0;
				int temp = num;
				while(temp !=0) {
					int r = temp % 10;
					rev = rev * 10 + r;
					temp = temp / 10;
				}
				System.out.println(num+" Reverse "+rev);
				
				
				int sum = 0;
				temp = num;
				while(temp !=0) {
					int r = temp % 10;
					sum = sum + r;
					temp = temp / 10;
				}
				System.out.println(num+" Sum of digits "+sum);
		} 
}
