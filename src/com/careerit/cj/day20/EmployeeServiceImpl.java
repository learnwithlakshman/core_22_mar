package com.careerit.cj.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

	private static volatile EmployeeService obj = null;

	private static List<Employee> empList = new ArrayList<>();

	{
		CsvReaderUtil util = CsvReaderUtil.getInstance();
		empList = util.getEmployees();
	}

	private EmployeeServiceImpl() {

	}

	public static EmployeeService getInstance() {
		if (obj == null) {
			synchronized (EmployeeServiceImpl.class) {
				if (obj == null) {
					obj = new EmployeeServiceImpl();
				}
			}
		}
		return obj;
	}

	@Override
	public int getEmpCountBy(final String country) {

		/*
		 * int count = 0; for(Employee emp:empList) {
		 * if(emp.getCountry().equalsIgnoreCase(country)) { count++; } }
		 * 
		 * return count;
		 */
		int count = (int) empList.stream().filter(e -> e.getCountry().equalsIgnoreCase(country)).count();
		return count;
	}

	@Override
	public CountryStatDto getEmpStatBy(String country) {

		/*
		 * List<Employee> countryList = new ArrayList<>(); for(Employee e:empList) {
		 * if(e.getCountry().equalsIgnoreCase(country)) { countryList.add(e); } }
		 * 
		 * int count = countryList.size(); double sum= 0; for(Employee e:countryList) {
		 * sum += e.getSalary(); } double avgSalary = sum / count;
		 */

		List<Employee> tempList = empList.stream().filter(e -> e.getCountry().equalsIgnoreCase(country))
				.collect(Collectors.toList());

		double sumOfSalary = tempList.stream().mapToDouble(e -> e.getSalary()).sum();
		int count = tempList.size();
		double avgSalary = sumOfSalary / count;
		return new CountryStatDto(country, count, avgSalary);
	}

	@Override
	public List<String> getUniqueGenders() {
		
		/*
		 * List<String> list = new ArrayList<String>();
		 * 
		 * for(Employee emp:empList) { String gender = emp.getGender();
		 * if(!list.contains(gender)) { list.add(gender); } }
		 */
		
		List<String> list = new ArrayList<String>();
		 empList.stream().forEach(emp->{
			 String gender = emp.getGender();
			 if(!list.contains(gender)) {
				 list.add(gender);
			 }
		 });
		return list;
	}

}
