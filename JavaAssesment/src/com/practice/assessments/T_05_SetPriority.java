package com.practice.assessments;

public class T_05_SetPriority extends Thread {
	public void run() {
		System.out.println("Thread Priority is : ");
	}

	public static void main(String[] args) {
		T_05_SetPriority t = new T_05_SetPriority();
		T_05_SetPriority t1 = new T_05_SetPriority();
		T_05_SetPriority t2 = new T_05_SetPriority();

		t1.setPriority(4);
		t.setPriority(5);
		t2.setPriority(8);
		System.out.println(t1.getPriority() + " " + t.getPriority() + " " + t2.getPriority());
		t.start();
		t1.start();
		t2.start();
	}
}
