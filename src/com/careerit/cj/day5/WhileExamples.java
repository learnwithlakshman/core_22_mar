package com.careerit.cj.day5;

public class WhileExamples {

	public static void main(String[] args) {

		// Sum of digits of given number until sum gets single digit

		int num = 9819;

		System.out.println("The sum of digits of " + num + " is " + sumOfDigits1(num));
		System.out.println("The sum of digits of " + num + " is " + sumOfDigits2(num));
	}

	private static int sumOfDigits2(int num) {

		int sum = 0;
		while (num > 9) {
			sum = num % 10 + num / 10;
			num = sum;
		}
		return sum;

	}

	private static int sumOfDigits1(int tmp) {
		while (tmp > 9) {
			int sum = 0;
			while (tmp != 0) {
				int r = tmp % 10;
				sum = sum + r;
				tmp = tmp / 10;
			}
			tmp = sum;
		}
		return tmp;
	}
}
