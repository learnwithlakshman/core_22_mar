package com.careerit.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Team {
		
		@JsonProperty(value = "name")
		private String teamName;
		private String city;
		private String coach;
		private String label;
		@JsonProperty(value = "home")
		private String homeGround;
		private List<Player> players;
		
	
}
