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
public class EmpCountryStatsDto {

		private String country;
		private int count;
		private double maxSalary;
		private double minSalary;
		private double avgSalary;
		private double totalSalary;
}
