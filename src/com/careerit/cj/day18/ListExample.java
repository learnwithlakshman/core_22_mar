package com.careerit.cj.day18;

import java.util.ArrayList;
import java.util.List;

class StoreElements {

	private List<String> list = new ArrayList<>();

	public void addEle(String ele) {
		list.add(ele);

	}

	public void removeEle(int index) {
		list.remove(index);
	}

	public int size() {
		return list.size();
	}

	public void showElements() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

class MyList<T>{
	
}

public class ListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Krish");
		list.add("Manoj");
		list.add("Charan");
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("Suresh");
		list1.add("Mahesh");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Suresh");
		list2.add("Mahesh");
		list2.add("Balu");
		
		for (String ele:list) {
			System.out.println(ele.toUpperCase());
    	}
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		list.add(1,"Kiran");
		System.out.println(list);
		list.set(1, "Kiran Kumar");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		list.addAll(list1);
		System.out.println(list);
		
		System.out.println(list1.containsAll(list1));
		System.out.println(list1.contains("Suresh"));
		
	
	}
}
