package com.careerit.cj.day4;

import java.util.Scanner;

public class PrintPatternExamples {

		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the n Value :");
				int n = sc.nextInt();
				
				for(int i=1;i<=n;i++) {
					
						for(int j=1;j<=i;j++) {
							System.out.print("* ");
						}
						System.out.println();
						
				}
				for(int i=n;i>=1;i--) {
					for(int j=1;j<=i;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				
				
				sc.close();
				
		}
}
