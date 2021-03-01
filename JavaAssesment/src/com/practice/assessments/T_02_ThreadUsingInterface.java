package com.practice.assessments;

public class T_02_ThreadUsingInterface implements Runnable{
	public void run() {
		System.out.println("Thread Success...");
	}
	public static void main(String args []) {
		T_02_ThreadUsingInterface t1 = new T_02_ThreadUsingInterface();
		Thread t = new Thread(t1);
		t.start();
		System.out.println("welcome");
	}
}
