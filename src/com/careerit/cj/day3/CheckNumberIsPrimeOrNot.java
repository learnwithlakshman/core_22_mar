package com.careerit.cj.day3;

import java.util.Scanner;

public class CheckNumberIsPrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();

		boolean isPrime = true;
		if (num > 0) {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime && num!= 1) {
				System.out.println(num + " is a prime");
			} else {
				System.out.println(num + " is not a prime");
			}
		}else {
			System.out.println("Please enter valid number");
		}
		sc.close();

	}
}
