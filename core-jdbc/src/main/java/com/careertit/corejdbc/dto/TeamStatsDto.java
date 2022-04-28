package com.careertit.corejdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamStatsDto {

		private String teamLabel;
		private String teamName;
		private double maxAmount;
		private double minAmount;
		private double avgAmount;
		private int count;
		
		
}
