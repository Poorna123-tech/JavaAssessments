package com.practice.accessmodifiers;

//we can use private acces mmodifiers only within the class but  not everywhere, if we need, use getter setter methods. 
class Example {
	private int i = 10;// private variables

	private void getmsg() { // private methods
		System.out.println("Hello Sree");
	}
}

public class PrivateExample {
	public static void main(String[] args) {
		Example ex = new Example();
		// Compile time error occurs bcoz when youu tried to access the private
		// modifiers
//		System.out.println(ex.i);----> compile time error
//		System.out.println(ex.getmsg());----> compile time error
	}
}
