package com.careerit.scart.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

		private Long pid;
		private String name;
		private String description;
		private double price;
		private double discount;
		private Long quantity;

}
