package com.careerit.cj.day3;

import java.util.Scanner;

public class FactorsOfGivenNumber {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the N value :");
			int N = sc.nextInt();
			
			int count = 0;
			for(int i=1;i<=N;i++) {
				if(N % i == 0) {
					System.out.print(i+" ");
					count++;
				}
			}
			
			System.out.println("\nFactors count is :"+count);
			
		}
}
