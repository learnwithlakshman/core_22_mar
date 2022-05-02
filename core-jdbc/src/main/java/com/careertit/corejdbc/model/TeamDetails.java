package com.careertit.corejdbc.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class TeamDetails {

		private String teamLabel;
		private String teamName;
}