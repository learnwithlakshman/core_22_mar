package com.careerit.json;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamStatDto {
	
		private String teamName;
		private int count;
		private double totalAmount;
		private List<String> playerNames;
		private List<RoleDto> roles;
		
}
