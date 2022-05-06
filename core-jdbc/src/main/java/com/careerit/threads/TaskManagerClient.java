package com.careerit.threads;

class TaskManager {
	private static volatile TaskManager taskManager;

	private TaskManager() {
	}

	public static TaskManager getInstance() {

		if (taskManager == null) {
			synchronized (TaskManager.class) {
				if (taskManager == null) {
					taskManager = new TaskManager();
				}
			}
		}

		return taskManager;
	}
}

public class TaskManagerClient {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			System.out.println(TaskManager.getInstance());
		});

		Thread t2 = new Thread(() -> {
			System.out.println(TaskManager.getInstance());
		});

		Thread t3 = new Thread(() -> {
			System.out.println(TaskManager.getInstance());
		});

		t1.start();
		t2.start();
		t3.start();

	}
}

// Inter communication
// Thread Pool
// Task Executors 
