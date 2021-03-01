package com.practice.assessment;

import java.util.Scanner;

public class T_07_Odd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		System.out.println("Odd");
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(s.charAt(i));
			}
		}
		sc.close();
}
}
