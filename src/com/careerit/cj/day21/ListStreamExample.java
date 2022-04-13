package com.careerit.cj.day21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListStreamExample {

		public static void main(String[] args) {
			
				List<Integer> list = new ArrayList<Integer>();
				
				while(list.size()<20) {
					int ele = ThreadLocalRandom.current().nextInt(1, 50);
					if(!list.contains(ele)) {
						list.add(ele);
					}
				}
				System.out.println(list);
				List<Integer> div3List = new ArrayList<>();
				for(Integer ele:list) {
					if(ele % 3 == 0) {
						div3List.add(ele);
					}
				}
				System.out.println(div3List);
				
				List<Integer> res = list
						                .stream()
						                .filter(ele->ele%3 ==0)
						                .collect(Collectors.toList());
				System.out.println(res);
				
				
				List<String> strList = new ArrayList<>();
				for(Integer ele:list) {
						strList.add(Integer.toBinaryString(ele));
					
				}
				
				List<String> binaryList = list.stream()
						                      .map(ele->Integer.toBinaryString(ele))
						                      .collect(Collectors.toList());
				System.out.println(strList);
				
				
		}
}
