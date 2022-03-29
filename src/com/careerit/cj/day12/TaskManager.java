package com.careerit.cj.day12;

public class TaskManager {

	private static TaskManager obj;
	private int count = 0;

	private TaskManager() {
	}

	private void openService() {
		count++;
	}

	public int getRunningServiceCount() {
		// Logic
		return count;
	}

	public static TaskManager getInstance() {
		if (obj == null) {
			obj = new TaskManager();
		}
		return obj;

	}
}
