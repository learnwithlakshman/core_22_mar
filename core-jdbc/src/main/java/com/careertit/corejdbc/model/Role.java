package com.careertit.corejdbc.model;

public enum Role {
	BATSMAN,BOWLER,WKEEPER,ALLROUNDER;
	
	public static Role getRole(String roleName) {
		switch (roleName.toLowerCase()) {
		case "batsman":
			return Role.BATSMAN;
		case "bowler":
			return Role.BOWLER;
		case "wk-batsman":
			return Role.WKEEPER;
		case "all-rounder":
			return Role.ALLROUNDER;
			
		default:
			throw new IllegalArgumentException("Invalid rolename :"+roleName);
		}
	}
}

