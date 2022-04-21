package com.careerit.iplstat.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import javax.naming.InsufficientResourcesException;


class InsufficientFundsExcption extends Exception{
	
		public InsufficientFundsExcption(String message) {
			super(message);
		}
		public InsufficientFundsExcption() {
			super("Sorry! you don't enough funds");
		}
}


public class ExceptionDemo implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("This object can't cloned");		
	}
	
	
	public void withDraw(double amount) throws InsufficientFundsExcption {
		double balance = 10000;
		if(amount > balance) {
			throw new InsufficientFundsExcption("You don't have enough funds");
		}
		
		balance = balance - amount;
		
	}
	
	public static void main(String[] args) {
		
				
		System.out.println("Start of main method");
		showResult();
		System.out.println("End of main method");

		try {
			readData("one");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		result(1,0,"div");

	}
	
	public static int result(int a,int b,String ope) {
		
		if(ope.equals("div")) {
			if(b == 0) {
				throw new ArithmeticException("Value of b can't zero");
			}else {
				return a / b;
			}
		}
		return 0;
	}

	public static List<String> readData(String fileName) throws IOException {
		return Files.readAllLines(Paths.get(fileName));
	}

	private static void showResult() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value of a:");
			int a = sc.nextInt();
			System.out.println("Enter the value of b:");
			int b = sc.nextInt();
			try {
				int res = a / b;
				System.out.println("Result :" + res);
			} catch (ArithmeticException e) {
				System.out.println("Value of be can't zero ");
				e.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
				System.out.println("Value of b can't zero" + e);
			} catch (RuntimeException e) {
			}

		}
	}
}
