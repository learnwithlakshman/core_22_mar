package com.careerit.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFile {

	public static void main(String[] args) {

		/*
		 * try { InputStream inputStream =
		 * ReadingFile.class.getResourceAsStream("/data/randomtext.txt"); String content
		 * = readDataFromFile(inputStream); System.out.println(content); } catch
		 * (IOException e) { System.out.println("Exception while reading file :" + e); }
		 */
		// readDataFromFile();
		List<Employee> list = readDataFromExcel();
		for(Employee emp:list) {
			System.out.println(emp.getName());
		}
		//createWorkBook();
	}

	private static void readDataFromFile() {

		try {
			List<String> list = Files
					.readAllLines(Paths.get(ReadingFile.class.getResource("/data/randomtext.txt").toURI()));
			for (String line : list) {
				System.out.println(line);
			}
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}

	private static String readDataFromFile(InputStream inputStream) throws IOException {

		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
		}
		return sb.toString();
	}

	public static List<Employee> readDataFromExcel() {
		List<Employee> empList = new ArrayList<Employee>();
		try {
			FileInputStream file = new FileInputStream(new File("employees.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			int count = 0;
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				if (count == 0) {
					count++;
					continue;
				}
				Iterator<Cell> cellIterator = row.cellIterator();

				int c = 0;
				long id = (long) row.getCell(c++).getNumericCellValue();
				String name = row.getCell(c++).getStringCellValue();
				String email = row.getCell(c++).getStringCellValue();
				int age = (int) row.getCell(c++).getNumericCellValue();
				Employee emp = Employee.builder().id(id).name(name).email(email).age(age).build();
				empList.add(emp);
			}

			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

	private static void createWorkBook() {
		final String WORKBOOK_NAME = "emp_workbook.xlsx";
		if (!Files.exists(Paths.get(WORKBOOK_NAME))) {
			try (FileOutputStream fos = new FileOutputStream(new File("emp_workbook.xlsx"))) {
				Workbook workbook = new XSSFWorkbook();
				Sheet sheet = workbook.createSheet("emp_details");
				int rowcount = 0;
				Row row = sheet.createRow(rowcount++);
				Object[] colHeading = getColumnHeadings();
				int i = 0;
				for (Object obj : colHeading) {
					Cell cell = row.createCell(i++);
					cell.setCellValue((String) obj);
				}
				Object empData[][] = getEmpData();
				for (Object obj[] : empData) {
					i = 0;
					row = sheet.createRow(rowcount++);
					for (Object ob : obj) {
						Cell cell = row.createCell(i++);
						cell.setCellValue((String) ob);
					}
				}
				workbook.write(fos);
				System.out.println("Work book is created successfully with name :" + WORKBOOK_NAME);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File already exists with the name :" + WORKBOOK_NAME);
		}
	}

	private static Object[] getColumnHeadings() {
		return new Object[] { "EMPNO", "ENAME", "EMAIL", "CITY" };
	}
	 public static Object[][] getEmpData() {  
         return new Object[][] { { "SPAN001", "Lakshman", "lakshman.a@spaneos.com", "Bangalore" },  
                   { "SPAN002", "Krish", "krish.t@spaneos.com", "Bangalore" },  
                   { "SPAN003", "Suresh", "suresh.s@spaneos.com", "Bangalore" },  
                   { "SPAN004", "Ramesh", "ramesh.r@spaneos.com", "Bangalore" } };  
    }  
}
