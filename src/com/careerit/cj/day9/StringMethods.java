package com.careerit.cj.day9;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String data = "Krish, Manoj,Charan,MOM,dad,Liril,John, Ramesh ,Suresh ,Jayesh";

		String[] arr = data.split(",");
		for (String name : arr) {
			// System.out.println(name +" "+name.length()+" "+name.trim().length());
			// Get 3 character from each name
			// System.out.println(name.trim().substring(0, 3).toUpperCase());

			// 'A','E','I','O','U'
			// char ch = name.trim().charAt(0);
			// if(ch == 'A' || ch == 'E'||ch=='I'||ch=='O'||ch=='U') {
			// System.out.println(name);
			// }
//					String tmp = name.trim().toUpperCase();
//					for(int i=tmp.length()-1 ;i>=0;i--) {
//						System.out.print(tmp.charAt(i));
//					}
//					System.out.println();
			if (isPalindrome(name)) {
				System.out.println(name.toUpperCase());
			}
			
			System.out.println(name.substring(name.length()-3));
			
		}
		System.out.println(Arrays.toString(getSubStrings("Krish", 8)));
		
		String s = "Core Java Learning is fun";
		System.out.println(s.substring(4,10).trim().substring(0,3).trim().toUpperCase());

	}

	// "Krish" -> 3 = "KRI,ISH"

	private static String[] getSubStrings(String data, int n) {

		if (data.length() != n && n < data.length()) {
			String[] temp = new String[data.length()];
			int count = 0;
			for (int i = 0; i < data.length() - n + 1; i++) {
				String t = data.substring(i, i + n);
				temp[count++] = t;
				
			}
			String[] sub = new String[count];
			System.arraycopy(temp, 0, sub, 0, count);
			return sub;
		} 
	
		return new String[] { data };
		
	}

	private static boolean isPalindrome(String name) {
		name = name.trim().toUpperCase();
		for (int i = 0, j = name.length() - 1; i <= j; i++, j--) {
			if (name.charAt(i) != name.charAt(j)) {
				return false;
			}
		}

		return true;
	}

}
