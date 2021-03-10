package com.practice.exceptioinhandling;

public class FirstThread extends Thread {
	Table t;

	FirstThread(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}
