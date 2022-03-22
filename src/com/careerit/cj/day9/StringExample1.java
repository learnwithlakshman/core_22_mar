package com.careerit.cj.day9;

public class StringExample1 {

		public static void main(String[] args) {
			
					String s1 = "Core Java";
					String s2 = "Core Java";
					System.out.println(s1 == s2);
					
					String s3 = new String("Core Java");
					String s4 = new String(new char[] {'C','o','r','e',' ','J','a','v','a'});
					
					System.out.println(s3 == s4);
					System.out.println(s2.equals(s4));
					System.out.println(s3.equals(s4));
					
					s1 = s1.concat("!");
					System.out.println(s1);
					System.out.println(s2);
					
					String s5 = "Core";
					s5 = s5.concat(" Java");
					String s6 = "Core Java";
					System.out.println(s5 == s6);
					System.out.println(s5.equals(s6));
		}
}
