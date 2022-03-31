package com.careerit.cj.day14;

class MathOperations{
	
	
			public int add(int a,int b) {
				return a + b;
			}
			
			public int add(int a,int b,int c) {
				return a + b + c;
			}
			public int add(int... arr) {
				int sum = 0;
				for(int ele:arr) {
					sum+= ele;
				}
				return sum;
			}
			
			public int biggest(int a,int b,int... arr) {
				int big = big(arr);
				return big;
			}
			public int biggest(int... arr) {
				int big = big(arr);
				return big;
			}
			public float add(int a,int b,String... c) {
				return 0;
			}
			
			public String add(String a,String b) {
				return a + b;
			}
			
			public float add(float a,float b) {
				return a + b;
			}
			
			private int big(int... args) {
				return 0;
			}
		
}

// Var args length variables
// Only one var args 

public class Manager {

		public final static void main(final String... args) {
			
				MathOperations obj = new MathOperations();
				
				
		}
}
