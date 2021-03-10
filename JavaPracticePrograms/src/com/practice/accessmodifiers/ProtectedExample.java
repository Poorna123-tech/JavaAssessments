package com.practice.accessmodifiers;

class Example2{
	protected int i = 10;
	protected void getmsg() {
		System.out.println("Hello Sree");
	}
}
public class ProtectedExample {
	public static void main(String[] args) {
		Example2 ex = new Example2();
		System.out.println(ex.i);		
		ex.getmsg();
	}
}
