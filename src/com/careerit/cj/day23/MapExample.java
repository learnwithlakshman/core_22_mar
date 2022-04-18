package com.careerit.cj.day23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

		public static void main(String[] args) {
			
				Map<String,Integer> map=new HashMap<String, Integer>();
				
				map.put("Krish", 35);
				map.put("Manoj", 25);
				map.put("Anish", 15);
				map.put("Anish", 16);
				map.put("Krish", 36);
		
				Set<String> set = map.keySet();
				for(String key:set) {
					System.out.println(key+" "+map.get(key));
				}
				Collection<Integer> values = map.values();
				for(Integer value:values) {
					System.out.println(value);
				}
				
				for(Map.Entry<String, Integer> entry:map.entrySet()) {
					System.out.println(entry.getKey()+" "+entry.getValue());
				}
				
				map.entrySet().forEach(ele->{
					System.out.println(ele.getKey()+" "+ele.getValue());
				});
				
				if(map.get("Manoj") != null) {
					map.put("Manoj", map.get("Manoj") + 1);
				}
				
				// If "Sai" -> 25
				map.putIfAbsent("Sai", 25);
				map.computeIfPresent("Sai",(t,u)-> u+1);
				map.putIfAbsent("Sai", 25);
				System.out.println(map);
		
		}
}
