package com.careerit.cj.game;

import java.util.Scanner;

public class ArrayExample {

		public static void main(String[] args) {
			
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the n:");
				int n = sc.nextInt();
				
				int[] arr = new int[n];
				
				for(int i=0;i<n;i++) {
					System.out.println("Enter the "+(i+1)+" person age ");
					arr[i] = sc.nextInt();
				}
				
				int sum = 0;
				for(int ele:arr) {
					sum += ele;
				}
				float avg = sum / (float)arr.length;
				System.out.println("The sum of age is  :"+sum);
				System.out.println("The count is       :"+arr.length);
				System.out.println("The average age is :"+avg);
				sc.close();
				
		}
}
