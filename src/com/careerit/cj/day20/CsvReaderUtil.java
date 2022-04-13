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
		try {
			List<String> dataList = Files.readAllLines(Paths.get("data/employees.csv"));
			dataList = dataList.subList(1, dataList.size());
			for (String data : dataList) {
				int i = 0;
				String[] arr = data.split(",");
				int id = Integer.parseInt(arr[i++]);
				String firstName = arr[i++];
				String lastName = arr[i++];
				String email = arr[i++];
				String gender = arr[i++];
				String country = arr[i++];
				double salary = Double.parseDouble(arr[i++]);

				Employee emp = Employee.builder().id(id).firstName(firstName).lastName(lastName)
						.email(email)
						.country(country)
						.gender(gender).salary(salary).build();
				list.add(emp);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}

}
