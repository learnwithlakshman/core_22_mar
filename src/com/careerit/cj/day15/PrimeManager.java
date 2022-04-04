package com.careerit.cj.day15;

import java.util.Arrays;

public class PrimeManager {

		public static void main(String[] args) {
			
			
					AbstractPrimeGen obj = new PrimeNumberGenerator();
					
					int[] primes = obj.primeInRange(10, 100);
					System.out.println(Arrays.toString(primes));
		}
}
