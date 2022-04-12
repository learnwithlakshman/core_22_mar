package com.careerit.cj.day20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class CsvReaderUtil {

	private static volatile CsvReaderUtil obj;

	private CsvReaderUtil() {
	}

	public static CsvReaderUtil getInstance() {
		if (obj == null) {
			synchronized (CsvReaderUtil.class) {
				if (obj == null) {
					obj = new CsvReaderUtil();
				}
			}
		}
		return obj;
	}

	public List<Employee> getEmployees() {

		List<Employee> list = new ArrayList<>();
		// Logic read csv file
		List<String> dataList;
		try {
			dataList = Files.readAllLines(Paths.get("data/employee.csv"));
			dataList = dataList.subList(1,dataList.size());
			for (String data : dataList) {
				for (String arr : data.split(",")) {
					int id;
					String firstName;
					String lastName;
					String country;
					String gender;
					double salary;

					Employee emp = Employee.builder().id(0).firstName(null).lastName(null).country(null).gender(null)
							.salary(0).build();
					list.add(emp);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
