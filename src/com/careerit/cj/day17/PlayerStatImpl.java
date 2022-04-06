package com.careerit.cj.day17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PlayerStatImpl implements PlayerStat {

	private static final List<Player> playerList;
	
	static {
		playerList=CsvReaderUtil.loadPlayers();
	}

	@Override
	public List<Player> filter(Predicate<Player> predicate) {
		List<Player> plist = new ArrayList<>();
		for(Player p:playerList) {
			if(predicate.test(p)) {
				plist.add(p);
			}
		}
		return plist;
	}
	
//	@Override
//	public List<Player> getPlayerByAmountGt(double amount) {
//		List<Player> plist = new ArrayList<>();
//		for(Player p:playerList) {
//			if(p.getPrice() > amount) {
//				plist.add(p);
//			}
//		}
//		return plist;
//	}
//
//	@Override
//	public List<Player> getPlayerByCountry(String country) {
//		List<Player> plist = new ArrayList<>();
//		for(Player p:playerList) {
//			if(p.getCountry().equals(country)) {
//				plist.add(p);
//			}
//		}
//		return plist;
//	}
//
//	@Override
//	public List<Player> getPlayerByRole(String role) {
//		List<Player> plist = new ArrayList<>();
//		for(Player p:playerList) {
//			if(p.getRole().equals(role)) {
//				plist.add(p);
//			}
//		}
//		return plist;
//	}

//	@Override
//	public List<Player> getPlayerByRoleAmountGt(double role, double amount) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
