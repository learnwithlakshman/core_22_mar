package com.careerit.junit.basics;

public class NumberOperations {

	public int div(int a, int b) {
		if (b != 0)
			return a / b;
		throw new ArithmeticException("The value b can't be zero");
	}

	public int biggest(int a, int b, int c) {
		/*
		 * if (a > b && a > c) { return a; } else if (b > c) { return b; } else { return
		 * c; }
		 */
		return (a > b && a > c) ? a : (b > c) ? b : c;
	}
}
