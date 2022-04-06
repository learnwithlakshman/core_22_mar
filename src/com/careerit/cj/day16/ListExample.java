package com.careerit.cj.day16;

import java.util.function.Consumer;
import java.util.function.Function;

interface MathOperations {

	public boolean isPrime(int num);

	public int primeCount(int lb, int ub);

	default int[] generatePrime(int lb, int ub) {
		int[] arr = new int[primeCount(lb, ub)];
		// Logic
		return arr;
	}

}

class X implements MathOperations {

	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int primeCount(int lb, int ub) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int[] generatePrime(int lb, int ub) {
		return MathOperations.super.generatePrime(lb, ub);
	}

}

interface MathOper {
	int perform(int a, int b);
}

class MyMath {
	int a = 10;
	int b = 20;

	public int calculate(MathOper ope) {
		return ope.perform(a, b);
	}
}

class L implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);

	}

}

class L2 implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return null;
	}

}
// Functional Interface

public class ListExample {

	public static void main(String[] args) {

		MyMath obj = new MyMath();

		MathOper m1 = (a, b) -> a * b;

		Consumer<String> con = (p) -> System.out.println(p);

		Function<String, Integer> fun = (s) -> {
			String t = s.toUpperCase();
			int len = t.trim().length();
			return len;
		};
	}
}
