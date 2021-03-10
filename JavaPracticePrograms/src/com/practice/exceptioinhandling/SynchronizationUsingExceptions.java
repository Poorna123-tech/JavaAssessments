package com.practice.exceptioinhandling;

public class SynchronizationUsingExceptions {

	public static void main(String args[]) {
		Table obj = new Table();// only one object
		FirstThread t1 = new FirstThread(obj);
		SecondThread t2 = new SecondThread();
		t1.start();
		t2.start();
	}
}
