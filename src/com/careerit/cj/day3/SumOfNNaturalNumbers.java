package com.careerit.cj.day3;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i; //sum = sum + i;
		}
		System.out.println("The sum is :"+sum);
		sc.close();
	}
}
