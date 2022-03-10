package com.careerit.cj.day3;

public class MultiplicationOf20Table {

	public static void main(String[] args) {

		for (int l = 1; l <= 20; l++) {
			int num = l;
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
			System.out.println("-------------------------");
		}
	}
}
