package com.careerit.cj.day11;

public class StudentManager {

		public static void main(String[] args) {
			Student s1 = new Student(1001,"Krish",2);
			Student s2 = new Student(2001,"Balu",4);
			Student s3 = new Student(3001,"Manoj",5);
			Student s4 = new Student(4001,"Krish",3);
			Student s5 = new Student(5001,"Balu",5);
			Student s7 = new Student(6001,"Charan Raj",5);
			Student[] arr = new Student[] {s1,s2,s3,s4,s5,s7};
			
    		for(Student s:arr) {
				
				if(s.getStd() == 5) {
					s.showInfo();
					s.promote(1);
					s.showInfo();
					System.out.println("--------------------");
				}
			}
			
			
				
		}
}
