package com.careerit.threads;

class Printer {

	public void printJob(int count, String data) {
		System.out.println("The current thread:" + Thread.currentThread().getName());
		synchronized (this) {
			for (int i = 1; i <= count; i++) {

				System.out.println(data + " - " + i + " by thread :" + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
					// TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

class Thread1 extends Thread {

	private Printer printer;

	public Thread1(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		printer.printJob(10, "First Thread");
	}
}

public class ThreadDemoExample {
	public static void main(String[] args) {
		System.out.println("Start of main method");
		Printer printer = new Printer();
		Thread1 t1 = new Thread1(printer);
		t1.setName("John");
		Thread1 t2 = new Thread1(printer);
		t2.setName("RK");
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of main method");

	}
}
