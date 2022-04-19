package com.careerit.iplstat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeamAmountDto {

		private String teamLabel;
		private String teamName;
		private double totalAmount;
}
