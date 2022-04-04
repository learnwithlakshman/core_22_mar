package com.careerit.cj.day15;

interface One {
	void m1();
}

interface Two {
	void m2();
}

interface Three extends  Two {
	void m3();
}

abstract class Four implements Three {
	
	@Override
	public void m3() {
		System.out.println("M3");
	}
}
class Five extends Four implements One,Two,Three{
	@Override
	public void m1() {
		
	}
	@Override
	public void m2() {
		
	}
}

abstract class A{
	String message = "hello";
	A(){
		System.out.println("A");
	}
	abstract void m1();
	void m2() {
		m1();
	}
}
class B extends A{

	@Override
	void m1() {
		
	}

}


public class InterfaceManager {

		public static void main(String[] args) {
			A obj=new B();
			obj.m2();
		}
}
