package com.practice.accessmodifiers;
//Public access modifiers we can use everywhere

class Example1{
	int i = 10;
	public void getmsg() {
		System.out.println("Hello sree");
	}
}
public class PublicExample {
	public static void main(String[] args) {
		Example1 ex = new Example1();
		System.out.println(ex.i);
		ex.getmsg();
	}
}
