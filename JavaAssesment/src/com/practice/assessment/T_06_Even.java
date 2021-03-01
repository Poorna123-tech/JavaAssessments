package com.practice.assessment;

import java.util.Scanner;

public class T_06_Even{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.next();
		
		System.out.println("Even");
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {
				System.out.println(s.charAt(i));
			}
		}
		sc.close();
	}
}
