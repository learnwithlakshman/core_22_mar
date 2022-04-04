package com.careerit.cj.day15;

public class PrimeNumberGenerator extends AbstractPrimeGen {

	@Override
	public boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num % 2 == 0 && num != 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
