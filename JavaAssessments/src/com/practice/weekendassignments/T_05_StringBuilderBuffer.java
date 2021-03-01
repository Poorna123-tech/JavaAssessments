package com.practice.weekendassignments;

public class T_05_StringBuilderBuffer {
		public static void main(String[] args) {
	String str = "Poorna";
	str1(str);
	// strings are immutable
	System.out.println(str);
	StringBuilder sb = new StringBuilder("sree");
	str2(sb);
	//StringBuilders are Mutable, they are not Synchronized.
	System.out.println(sb);

	StringBuffer sBuffer = new StringBuffer("chinna");
	str3(sBuffer);
	System.out.println(sBuffer);

	}

	public static void str1(String s) {
	s = s + "Hi";
	}

	public static void str2(StringBuilder s1) {
	s1.append("chinna");
	}

	public static void str3(StringBuffer s2) {
	s2.append("..");
	}

	}

