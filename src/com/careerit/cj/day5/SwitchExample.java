package com.careerit.cj.day5;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// Accept two numbers from user and perform those operations // 1. Add 2. Mul 3.
		// Div 4. Power based his/her selection

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();

		while (true) {
			System.out.println("1. Add 2. Mul 3. Div 4.Power");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case 2:
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case 3:
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			case 4:
				System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
				break;
			default:
				System.out.println("You entered wrong choice ... please enter 1-5 only");
			}
			System.out.println("Do you want to continue...  1-C");
			ch = sc.nextInt();
			if (ch != 1) {
				System.out.println("Thank you, Visit again");
				break;
			}
		}

	}
}
