package com.careerit.cj.day15;

public class Car extends AbstractGame implements Game {

	

	@Override
	public void play() {
		System.out.println("You are playing "+this.getClass().getSimpleName()+" Please wear seat belt");
		
	}

	

}
