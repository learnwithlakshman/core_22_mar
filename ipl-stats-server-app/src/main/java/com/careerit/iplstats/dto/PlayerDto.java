package com.careerit.iplstats.dto;

import lombok.Data;

@Data
public class PlayerDto {
    private Long id;
    private String name;
    private String role;
    private String country;
    private double amount;
    private String teamCode;
}
