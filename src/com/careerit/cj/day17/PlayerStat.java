package com.careerit.cj.day17;

import java.util.List;
import java.util.function.Predicate;

public interface PlayerStat {

	/*
	 * public List<Player> getPlayerByAmountGt(double amount); public List<Player>
	 * getPlayerByCountry(String country); public List<Player>
	 * getPlayerByRole(String role); public List<Player>
	 * getPlayerByRoleAmountGt(double role,double amount);
	 */
		
		public List<Player> filter(Predicate<Player> predicate);
}
