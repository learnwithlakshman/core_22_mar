package com.careerit.cj.day16;

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


interface MathOper{
	 int perform(int a,int b);
}




class MyMath{
	int a = 10;
	int b = 20;
	public int calculate(MathOper ope) {
		return ope.perform(a, b);
	}
}

// Functional Interface

public class ListExample {

	public static void main(String[] args) {

		MyMath obj = new MyMath();

		int res = obj.calculate((a, b)-> a * b);
		System.out.println(res);
	}
}
