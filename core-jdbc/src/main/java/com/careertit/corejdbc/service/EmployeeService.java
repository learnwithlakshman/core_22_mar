package com.careertit.corejdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.careertit.corejdbc.dto.EmpCountryStatsDto;
import com.careertit.corejdbc.dto.Employee;
import com.careertit.corejdbc.dto.EmployeeCount;
import com.careertit.corejdbc.util.ConnectionUtil;

public class EmployeeService {
	
	private static final String EMP_LIST_COUNTRY_Q="select id,first_name,last_name,email,gender,salary,country from employee where country=?";
	private static final String EMP_COUNT_Q = "select country,count(1) as count from employee group by country";
	
	public Employee addEmployee(Employee employee) {
		return null;
	}
	public Employee getEmployee(Long id) {
		return null;
	}
	public List<Employee> search(String str){
		return null;
	}
	public List<EmpCountryStatsDto> getEmployeeCountryStats(){
		return null;
	}
	
	public List<Employee> getEmployees(String countryName) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List<Employee> list = new ArrayList<Employee>();
		try {
			con = ConnectionUtil.obj.getConnection();
			st = con.prepareStatement(EMP_LIST_COUNTRY_Q);
			st.setString(1, countryName);
			rs = st.executeQuery();

			while (rs.next()) {
				Long id = rs.getLong("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				String gender = rs.getString("gender");
				double salary = rs.getDouble("salary");
				String country = rs.getString("country");
				Employee emp = Employee.builder().id(id).firstName(firstName).lastName(lastName).gender(gender)
						.email(email).salary(salary).country(country).build();
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.obj.close(rs, st, con);
		}
		return list;
	}

	public List<EmployeeCount> getEmployeeCountOfEachCountry() {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<EmployeeCount> list = new ArrayList<>();
		try {
			con = ConnectionUtil.obj.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(EMP_COUNT_Q);
			while (rs.next()) {
				String country = rs.getString("country");
				int count = rs.getInt("count");
				EmployeeCount obj = EmployeeCount.builder().country(country).count(count).build();
				list.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.obj.close(rs, st, con);
		}
		return list;
	}
}
