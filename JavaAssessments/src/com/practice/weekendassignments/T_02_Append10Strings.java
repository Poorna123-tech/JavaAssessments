package com.practice.weekendassignments;
import java.util.Scanner;
public class T_02_Append10Strings {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	System.out.println("add 10 strings:");
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < 10; i++) {
	String s = sc.nextLine();
	sb.append(s);

	}
	System.out.println("appended strings :"+sb.toString());


	}

	}

