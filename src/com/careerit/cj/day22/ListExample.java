package com.careerit.cj.day22;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

		public static void main(String[] args) {
			
				List<Integer> list = new ArrayList<>();
				list.add(1);
				list.add(10);
				list.add(9);
				list.add(8);
				
				System.out.println(list);
				list.sort(Integer::compareTo);
				System.out.println(list);
		}
}
