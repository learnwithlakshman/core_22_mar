package com.careerit.cj.day17;

import java.util.List;
import java.util.function.Predicate;

/*
CSV

Read data from csv and solve the following questions

Get players by amount is gt [200000,..]
Get players by country [Australia,India,...]
Get player by role   [Batsman]
 
 */
class X implements Predicate<Player>{

	@Override
	public boolean test(Player t) {
		return t.getPrice()>2000000;
	}

}
class Y implements Predicate<Player>{

	@Override
	public boolean test(Player t) {
		return t.getCountry().equals("India");
	}

}

interface MathOpe<T>{
	T perform(T a,T b);
}

public class LambdaManager {

	public static void main(String... args) {
		
			PlayerStat obj = new PlayerStatImpl();
			List<Player> list1 = obj.filter((p)->p.getPrice()>2000000);
			List<Player> list2 = obj.filter((p)->getFilterCondition(p));
			
			MathOpe<Float> m1 = (x,y)->x>y?x:y;
			System.out.println(m1.perform(3.5f,6.4f));
	}

	private static boolean getFilterCondition(Player p) {
		return p.getPrice()>15000000 && p.getCountry().equals("India");
	}
}
