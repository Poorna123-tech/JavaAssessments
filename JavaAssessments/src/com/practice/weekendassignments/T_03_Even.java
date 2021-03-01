package com.practice.weekendassignments;

import java.util.Scanner;

public class T_03_Even {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the input :");
		String str  = sc.nextLine();
		char[] ch = str.toCharArray();
		for(int i = 0; i<ch.length;i++) {
			if(i%2 == 0)
				System.out.println("Output is :" + ch[i]);
		}
	}
}
