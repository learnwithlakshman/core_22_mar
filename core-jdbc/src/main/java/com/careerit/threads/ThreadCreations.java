package com.careerit.threads;

import java.util.concurrent.TimeUnit;


class One implements Runnable{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(Thread.currentThread().getName()+" - "+i);
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadCreations {

		public static void main(String[] args) {
			
				One obj = new One();
				
				Thread t1 = new Thread(obj,"t1");
				Thread t2 = new Thread(obj,"t2");

				Thread t3 = new Thread(()->{
					for(int i=1;i<=10;i++) {
						try {
							TimeUnit.SECONDS.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName());
					}
				},"t3");
				
				t1.start();
				t2.start();
				t3.start();
				
		}
}
