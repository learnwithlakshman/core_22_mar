package com.careertit.corejdbc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

		private Long id;
		private String firstName;
		private String lastName;
		private String email;
		private String gender;
		private double salary;
		private String country;
		
}
