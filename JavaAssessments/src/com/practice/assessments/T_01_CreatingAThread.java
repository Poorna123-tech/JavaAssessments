package com.practice.assessments;

public class T_01_CreatingAThread extends Thread{
	public void run() {
		System.out.println("creating a thread...");
	}
	public static void main(String args[]) {
		T_01_CreatingAThread t = new T_01_CreatingAThread();
			t.start();
	}
}
