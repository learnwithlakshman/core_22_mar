package com.careerit.junit.basics;
public class FundamentalPrograms {

	public int reverseOfNumber(int num) {
		// TODO write logic
		return 0;
	}

	public int sumOfDigits(int num) {
		// TODO write logic
		return 0;
	}

	public boolean isPrime(int num) {
		if(num < 0)
			return false;
		if(num % 2 == 0 && num != 2) 
			return false;
		for(int i=2;i<=num/2;i++) {
			if(num % i==0)
				return false;
		}
		return true;
	}

	public int nthFibonacciNumber(int n) {
		// TODO write logic
		return 0;
	}

	public boolean isPalindrome(int num) {
		// TODO write logic
		return false;
	}

	public int countPrimes(int lb, int ub) {
		// TODO write logic
		return 0;
	}

}