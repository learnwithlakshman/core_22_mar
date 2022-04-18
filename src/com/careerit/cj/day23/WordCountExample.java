package com.careerit.cj.day23;

import java.util.HashMap;
import java.util.Map;

public class WordCountExample {

		public static void main(String[] args) {
			
			String[] arr = "Linux,Unix,Java,.Net,Python,Python,Java,.Net,Unix,Linux,PHP,BootStrap,HTML,BootStrp,CSS".split(",");
			Map<String, Integer> map = new HashMap<String, Integer>();
			for(String ele:arr) {
				
//				if(map.get(ele) == null) {
//					map.put(ele, 1);
//				}else {
//					map.put(ele, map.get(ele)+1);
//				}
				
				map.computeIfPresent(ele, (t,u)->u+1);
				map.putIfAbsent(ele, 1);
				
			}
			System.out.println(map);
		}
}
