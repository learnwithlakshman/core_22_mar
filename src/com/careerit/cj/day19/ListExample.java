package com.careerit.cj.day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

interface MyView<T> {

	boolean hasNext();

	T next();

}

interface MyList<T> {
	void add(T ele);
}

class ContainerSequence<T> implements MyList<T> {
	private Object[] arr = new Object[3];
	int count = 0;

	public void add(T ele) {
		// Logic
		arr[count++] = 0;
	}

	public MyView<T> view() {
		return new MyView<T>() {
			int i = 0;

			@Override
			public boolean hasNext() {
				if (i < count)
					return true;
				else
					return false;
			}

			@Override
			public T next() {
				T ele = (T) arr[i++];

				return ele;
			}
		};
	}

}

class ContainerRandom<T> implements MyList<T> {
	private Object[] arr = new Object[3];
	private int count = 0;

	public void add(T ele) {
		// Logic
		arr[count++] = 0;
	}

}

interface One {
	void m1();
}

public class ListExample {

	public static void main(String[] args) {

		/*
		 * One one =new One(){
		 * 
		 * @Override public void m1() { // TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * };
		 * 
		 * Runnable runnable=new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("Hello"); } };
		 * 
		 * Runnable run1 = ()->{System.out.println("Hello");};
		 * 
		 * Comparator<Integer> comp = new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { // TODO Auto-generated
		 * method stub return 0; } };
		 * 
		 * Comparator<Integer> comp1 = (a,b)-> a > b ? a:b;
		 * 
		 * MyList<String> list = new ContainerSequence<>(); list.add("Hello");
		 * list.add("Bye");
		 */

		String data = "Krish,Manoj,Charan,Raj,Rama Krishna,Naresh";

		List<String> list = new ArrayList<>();

		for (String name : data.split(",")) {
			list.add(name);
		}

		// for loop
		System.out.println("---------------Using for loop--------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// for each
		System.out.println("--------------Using for each----------");

		for (String ele : list) {
			System.out.println(ele);
		}

		// Iterator
		System.out.println("------------- Using iterator ---------");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String ele = itr.next();
			if (ele.equals("Naresh")) {
				itr.remove();
			}
			System.out.println(ele);
		}
		// ListIterator
		System.out.println("-------------Using list iterator ----------");
		ListIterator<String> listItr = list.listIterator();
		while (itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}
		while (listItr.hasPrevious()) {
			String ele = listItr.previous();
			if (ele.equals("Krish")) {
				listItr.set("Krishna");
				listItr.add("Mohan Krishna");
			}
			System.out.println(ele);
		}

		Consumer<String> obj = (t) -> {
				//Logic
		};

		// show((ele)->System.out.println(ele));
		Consumer<String> con = (ele) -> System.out.println(ele.toUpperCase());
		list.stream().forEach(ele -> {
			System.out.println(ele.length());
			System.out.println(ele.toUpperCase());
		});

	}

	public static void show(Consumer<String> consumer) {

		consumer.accept("Hello world");
	}
}
