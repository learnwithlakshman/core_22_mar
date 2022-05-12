package com.careerit.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
//https://www.callicoder.com/java-8-completablefuture-tutorial/?msclkid=e2129f83cf3211ec886bebb510209b41#2-thenaccept-and-thenrun

public class Manager {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		CompletableFuture.supplyAsync(()->getNames(),es)
		       .thenApplyAsync((name)->{ try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} return "Hi "+name+" welcome to java world";},es)
		    .thenAccept((message)->System.out.println(message));
		
		System.out.println("Hello.....");
		
	}
	
	
	
	
	
	
	
	
	private static String getNames() {
		return "Krish";
	}
}
