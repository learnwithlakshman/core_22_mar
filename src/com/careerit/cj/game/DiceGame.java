package com.careerit.cj.game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rnum = ThreadLocalRandom.current().nextInt(1, 7);
		System.out.println("------------Welcome to 6 Face Dice Game-----------");
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		System.out.println("Dear " + name + ", you have maximum 3 attempts to guess the number");

		int max = 3;
		int count = 1;
		while (count <= 3) {
			System.out.println("Enter your choice :");
			int gnum = sc.nextInt();
			if (rnum == gnum) {
				System.out.println("You guessed number in " + count);
				break;
			} else {
				System.out.println("Sorry! it is wrong guess, you have " + (max - count) + " attempts");
				if(count == 3) {
					System.out.println("The generated number is :"+rnum);
				}
			}
			count++;
		}
    	sc.close();
	}
}
