package com.careerit.cj.day2;

import java.util.Scanner;

public class StudentGrade {
		// score 
		// 9-10 "A"
	   //  6-8  "B"
	   //  0-5  "C"
	   // "Sorry! invalid score"
	
		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the score :");
				int score = sc.nextInt();
				
				String grade="";
				if(score >=9 && score <=10) {
					grade = "A";
				}else if(score >=6 && score <=8) {
					grade = "B";
				}else if(score >=0 && score <=5) {
					grade = "C";
				}else {
					grade = "Invalid Score";
				}
				System.out.println("Score :"+score +" and grade : "+grade);
				sc.close();
				
		}
	
		
}
