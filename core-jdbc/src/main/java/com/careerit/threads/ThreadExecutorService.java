package com.careerit.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Calc implements Callable<String> {

	@Override
	public String call() throws Exception {
		String str = "";
		for (int i = 1; i <= 10; i++) {
			TimeUnit.SECONDS.sleep(2);
			str += i + " ";
		}
		return str.trim();
	}

}

public class ThreadExecutorService {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		Future<String> future = executorService.submit(new Calc());

		
		try {
			String res = future.get();
			System.out.println(res);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}
}
