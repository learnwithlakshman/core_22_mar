package com.careerit.cj.day20;

import java.util.List;

public interface EmployeeService {

		public int getEmpCountBy(String country);
		public CountryStatDto getEmpStatBy(String country);
		public List<String> getUniqueGenders();	
}
