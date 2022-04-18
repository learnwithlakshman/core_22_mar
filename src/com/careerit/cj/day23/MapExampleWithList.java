package com.careerit.cj.day23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExampleWithList {

	public static void main(String[] args) {

		String[] arr = "CS-GLN,CS-ALN,CS-KVR,EC-JVR,EC-MVR,IS-MCS,IS-PKM".split(",");

		Map<String, List<String>> map = new HashMap<String, List<String>>();

		for (String ele : arr) {
			String[] subArr = ele.split("-");
			String dept = subArr[0];
			String name = subArr[1];

			if (map.get(dept) == null) {
				List<String> list = new ArrayList<String>();
				map.put(dept, list);
			}

			List<String> nameList = map.get(dept);
			nameList.add(name);
			map.put(dept, nameList);
		}
		System.out.println(map);
	}
}
