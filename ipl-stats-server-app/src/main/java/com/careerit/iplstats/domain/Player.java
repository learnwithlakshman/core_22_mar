package com.careerit.iplstats.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Player{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String name;
    private String role;
	private String country;
	private double amount;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="team_id",referencedColumnName = "id")
	private Team team;
}