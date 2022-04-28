package com.careertit.corejdbc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.careertit.corejdbc.model.Player;
import com.careertit.corejdbc.model.TeamDetails;


public enum DBInit {
util;	
	private ConnectionUtil conUtil = ConnectionUtil.obj;		
	private CsvReaderUtil readerUtil = CsvReaderUtil.getInstance();
	
	public void init() {
		insertTeamDetails();
		insertPlayerDetails();
	}
	
	private void insertTeamDetails() {
		String add_team_query = "insert into team(team_label,team_name) values(?,?)";
		List<TeamDetails> teamDetails = readerUtil.loadTeamDetailsFromCSV();
		Connection con = null;
		PreparedStatement st = null;
		try {
			con=conUtil.getConnection();
			con.setAutoCommit(false);
			st = con.prepareStatement(add_team_query);
			for(TeamDetails td:teamDetails) {
				st.setString(1, td.getTeamLabel());
				st.setString(2, td.getTeamName());
				st.addBatch();
			}
			int[] res = st.executeBatch();
			for(int i=0;i<res.length;i++) {
				int ele = res[i];
				if(ele == 0) {
					System.out.println("Row number :"+(ele+1)+" has invalid data please and reprocess");
					return;
				}
			}
			System.out.println("Total "+res.length+" teams are inserted");
			con.commit();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	private void insertPlayerDetails() {
		List<Player> players = readerUtil.loadPlayerFromCSV();
		//JDBC
	}
		
}
