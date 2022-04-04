package com.careerit.cj.day15;

public abstract class AbstractPrimeGen {

	public int[] primeInRange(int lb, int ub) {

		int count = primeCount(lb, ub);
		int[] temp = new int[count];
		for (int i = lb, j = 0; i <= ub; i++) {
			if (isPrime(i)) {
				temp[j++] = i;
			}
		}
		return temp;
	}

	public int primeCount(int lb, int ub) {

		int count = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public abstract boolean isPrime(int num);

}
