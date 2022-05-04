package com.careerit.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Manager {

		public static void main(String[] args) {
			
				ObjectMapper objMpMapper = new ObjectMapper();
				String jsonStr = "{\r\n"
						+ "	\"empno\":8899,\r\n"
						+ "	\"ename\":\"Krish\",\r\n"
						+ "	\"salary\":9999.45\r\n"
						+ "}";
				
				try {
					Employee emp = objMpMapper.readValue(jsonStr, Employee.class);
					System.out.println(emp.getEmpno()+" - "+emp.getEname()+" - "+emp.getSalary());
					objMpMapper.writeValue(new File("emp.json"), emp);
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
}
