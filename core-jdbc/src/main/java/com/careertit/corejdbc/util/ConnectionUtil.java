package com.careertit.corejdbc.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public enum ConnectionUtil {
	obj;
	
	private static Properties properties;
	static {
		properties =new Properties();
		try {
			properties.load(ConnectionUtil.class.getResourceAsStream("/db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/core_jdbc", "dbuser", "dbuser");
		} catch (SQLException e) {
			System.out.println("While connecting with database :" + e);
		}
		return con;
	}

	public void close(ResultSet rs, Statement st, Connection con) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			System.out.println("While closing :" + e);
		}
	}

	public void close(Statement st, Connection con) {

		try {
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			System.out.println("While closing :" + e);
		}
	}
}
