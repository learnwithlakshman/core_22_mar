package com.careerit.iplstat.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Player {
	
	private String name;
	private String role;
	private double price;
	private String country;
	private String teamLabel;
	
}   
    