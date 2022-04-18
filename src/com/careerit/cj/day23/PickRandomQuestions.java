package com.careerit.cj.day23;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PickRandomQuestions {

	public static void main(String[] args) {

		List<Integer> list = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());

		// 20 Random questions

		Set<Integer> questionSet = new HashSet<>();
		while (questionSet.size() <= 20) {
			int ele = list.get(ThreadLocalRandom.current().nextInt(1, 100));
			questionSet.add(ele);
		}
		System.out.println(questionSet);

		
		List<String> list1 = List.of("GLN","ALN","NVR","KVR","GVK");
		List<String> list2 = List.of("GLN","ALN","MVR","KVR","GVK");
		List<String> list3 = List.of("ALN","KVS","KBD");
		
		Set<String> namesSet = new HashSet<String>();
		namesSet.addAll(list1);
		namesSet.addAll(list2);
		namesSet.addAll(list3);
		System.out.println(namesSet);
		
		
		
	}
}
