package com.careerit.cj.day20;

public class EmployeeManager {

		public static void main(String... args) {
			
				EmployeeService empService = EmployeeServiceImpl.getInstance();
				
				System.out.println(empService.getUniqueGenders());
		
		}
}
