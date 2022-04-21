package com.careerit.iplstat.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TeamRoleDto {
	private String teamLabel;
	private String teamName;
	private List<RoleInfoDto> roleInfoList;
}
