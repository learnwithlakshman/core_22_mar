package com.careerit.cj.day15;


public class Bike extends AbstractGame implements Game {

	

	@Override
	public void play() {
		System.out.println("You are playing "+this.getClass().getSimpleName()+" Please wear helmet");
		
	}

	

}
