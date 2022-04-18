package com.careerit.cj.day23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class SetExamples {

		public static void main(String[] args) {
			
			Set<Integer> set = new HashSet<>();
			
			set.add(1004);
			set.add(1001);
			set.add(1002);
			set.add(1001);
			set.add(1002);
			set.add(1003);
			
			
			Iterator<Integer> itr = set.iterator();
			while(itr.hasNext()) {
				int ele = itr.next();
				System.out.println(ele);
			}
			
			for(Integer ele:set) {
				System.out.println(ele);
			}
			
			set.stream().forEach(ele->{
				System.out.println(ele);
			});
			
		}
}
