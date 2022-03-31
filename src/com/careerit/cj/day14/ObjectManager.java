package com.careerit.cj.day14;

class One {

	public void printSampleMessage() {
		System.out.println("one of m1");
	}
}

class Two extends One {
	
	@Override
	public void printSampleMessage() {
		System.out.println("two of m1");
	}
}

class Person {
	String name = "Krish";
	int age = 25;

	@Override
	public String toString() {
		return String.format("Person name : %s and age : %s", name, age);
	}
}

public class ObjectManager extends Object {

	public static void main(String[] args) {

		Person obj = new Person();
		System.out.println(obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode()));
		System.out.println(obj);
		System.out.println(obj.toString());
	}
}
