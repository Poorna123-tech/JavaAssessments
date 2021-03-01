package com.practice.assessment;

import java.util.Scanner;

public class T_02_Appen10Strings {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	System.out.println("add 10 strings:");
	StringBuffer sb = new StringBuffer();
	for (int i = 0; i < 10; i++) {
	String s = sc.nextLine();
	sb.append(s);

	}
	System.out.println("appended strings :"+sb.toString());


	}

}
