package com.careerit.cj.day1;

import java.util.Scanner;

public class CabBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the count    :");
		int count = sc.nextInt();
		System.out.println("Enter the capacity :");
		int capacity = sc.nextInt();
		
		int r = count % capacity;        //(10 % 4 => 2)
		int rcount = count / capacity;  // (10 / 2 => 2)
		
		if(r != 0) {
			rcount = rcount + 1;
		}
		
		System.out.println("Count :"+count+" with capacity "+capacity+" required "+rcount);
		sc.close();
		
	}
}
