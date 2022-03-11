package com.careerit.cj.day4;

public class GeneratePrimes {

	public static void main(String[] args) {

			int lb = 20;
			int ub = 50;
			
			for(int i=lb;i<=ub;i++) {
				if(isPrime(i)) {
					System.out.println(i);
				}
			}
			
			// Generate N primes 
			System.out.println("Generate first N primes");
			int n = 100;
			int count = 0;
			for(int i=2;;i++) {
				if(isPrime(i)) {
					System.out.print(i+" ");
					count++;
				}
				if(count == n) {
					break;
				}
					
			}
			System.out.println("\nContinue Example");
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=5;j++) {
					if(i == j) 
						continue;
					System.out.println(i+" "+j);
				}
				System.out.println();
			}
			
			
			
	}

	private static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		if (num % 2 == 0 && num != 2) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}
}
