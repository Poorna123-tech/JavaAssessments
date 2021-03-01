package com.practice.assessments;

class MultiThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class T_03_MultiThreading {
	public static void main(String[] args) {
		Thread t = new Thread(" Thread 1");
		Thread t1 = new Thread(" Thread 2");
		Thread t2 = new Thread(" Thread 3");
		Thread t3 = new Thread(" Thread 4");
		Thread t4 = new Thread(" Thread 5");
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}
