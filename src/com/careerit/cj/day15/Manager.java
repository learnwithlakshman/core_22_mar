package com.careerit.cj.day15;

import java.util.Scanner;

public class Manager {

		public static void main(String[] args) {
				
				System.out.println("1.Bike 2.Car 3.Ship");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				Game obj = getSeletedGame(num);//new Bike();
				obj.start();
				obj.play();
				obj.stop();
		}

		private static Game getSeletedGame(int num) {
			if(num == 1)
				return new Bike();
			else if(num == 2)
				return new Car();
			else 
				return new Ship();
		}
}
