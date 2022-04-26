package com.careertit.corejdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.careertit.corejdbc.util.ConnectionUtil;

public class JdbcExample {

	public static void main(String[] args) {
		
			JdbcExample obj = new JdbcExample();
			//obj.createTable();
			//obj.addPlayer("Manoj",4500000);
			//obj.addPlayer("Charan",355000);
			//obj.deletePlayer("Krish");
			obj.showPlayers();
	}
	
	private void showPlayers() {
		String get_player="select name,price from player;";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con=ConnectionUtil.obj.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(get_player);
			while(rs.next()) {
				String name =rs.getString("name");
				double price =rs.getDouble("price");
				System.out.println("Name :"+name+"\nPrice :"+price);
				System.out.println("*".repeat(15));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.obj.close(st, con);
		}
	}
	
	private void deletePlayer(String name) {
		String add_player = "delete from player where name=?";
		Connection con = null;
		PreparedStatement st = null;
		try {
			con=ConnectionUtil.obj.getConnection();
			st = con.prepareStatement(add_player);
			st.setString(1, name);
			System.out.println(st);
			int count = st.executeUpdate();
			System.out.println("Total "+count+" player(s) deleted");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.obj.close(st, con);
		}
		
	}
	
	private void updatePlayer(String name, double price) {
		String add_player = "update player set price=? where name=?";
		Connection con = null;
		PreparedStatement st = null;
		try {
			con=ConnectionUtil.obj.getConnection();
			st = con.prepareStatement(add_player);
			st.setDouble(1, price);
			st.setString(2, name);
			System.out.println(st);
			int count = st.executeUpdate();
			System.out.println("Total "+count+" player(s) updated");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.obj.close(st, con);
		}
		
	}
	
	private void addPlayer(String name, double price) {
		String add_player = "insert into player(name,price) values(?,?);";
		Connection con = null;
		PreparedStatement st = null;
		try {
			con=ConnectionUtil.obj.getConnection();
			st = con.prepareStatement(add_player);
			st.setString(1, name);
			st.setDouble(2, price);
			System.out.println(st);
			int count = st.executeUpdate();
			System.out.println("Total "+count+" player(s) added");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.obj.close(st, con);
		}
		
	}

	private void createTable() {
			
			String player_table = "create table player(name varchar(100),price float);";
			Connection con = null;
			Statement st = null;
			try {
				con=ConnectionUtil.obj.getConnection();
				st = con.createStatement();
				st.execute(player_table);
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ConnectionUtil.obj.close(st, con);
			}
	}
	
	
}
