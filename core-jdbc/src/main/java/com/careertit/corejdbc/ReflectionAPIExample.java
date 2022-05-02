package com.careertit.corejdbc;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Iterator;

class One implements Cloneable, Serializable {
	public One() {

	}

	private One(int a) {

	}

	public void m1() {

	}

	public int m2() {
		return 1;
	}

	public int m3(int a, int b) {
		return a + b;
	}
}

public class ReflectionAPIExample {

	public static void main(String[] args) {

		try {
			Class cls = Class.forName("com.careertit.corejdbc.One");
			Method[] methods = cls.getDeclaredMethods();
			for (Method m : methods) {
				System.out.println(m);
			}
			Class[] inf = cls.getInterfaces();
			for (Class ele : inf) {
				System.out.println(ele);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Class c = Class.forName("com.careertit.corejdbc.One");
			Method method = c.getMethod("m3",Integer.TYPE,Integer.TYPE);
			Integer res = (Integer) method.invoke(new One(), new Object[] { 1,9 });
			System.out.println("The result is :" + res);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
