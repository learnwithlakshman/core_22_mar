package com.careerit.cj.day15;

public abstract class AbstractGame implements Game {
	
	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " is going start");

	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " is going stop");

	}
}
