package com.careerit.cj.day20;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortByCountry implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getCountry().compareTo(o1.getCountry());
	}
	
}

class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.valueOf(o1.getSalary()).compareTo(o2.getSalary());
	}
	
}

public class EmployeeManager {

		public static void main(String... args) {
			
				EmployeeService empService = EmployeeServiceImpl.getInstance();
				
				System.out.println(empService.getUniqueGenders());
				
				
				CsvReaderUtil obj = CsvReaderUtil.getInstance();
				
				List<Employee> list = obj.getEmployees();
				
				
				Collections.sort(list,Comparator.comparing(Employee::getSalary));
				  
		
				
				list.sort(Comparator.comparing(Employee::getCountry).thenComparing(Employee::getSalary));
				
				for(int i=0;i<100;i++) {
					System.out.println(list.get(i));
				}
		
		}
}
