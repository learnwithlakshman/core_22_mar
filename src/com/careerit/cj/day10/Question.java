package com.careerit.cj.day10;

public class Question {

	public static void main(String[] args) {
			String[] arr = new String[6];
			for(int i=0;i<args.length;i++) {
				arr[i] = args[i];
			}
			arr[4] = null;
			for(String ele:arr) {
				System.out.println(ele.toUpperCase());
			}
		
		
	}
}

//java Question One Two Three Four Five Six

