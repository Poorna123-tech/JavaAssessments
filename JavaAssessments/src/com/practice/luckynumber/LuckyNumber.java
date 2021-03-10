package com.practice.luckynumber;

import java.util.*;

public class LuckyNumber {
	public static void main(String[] args) {
		int n, rem, sum = 0;
		ArrayList<String> s = new ArrayList<String>();
		String s2;
		int date, year, month;

		// Taking Date as Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date in the 15-Mar-1995 Format:");
		String day = sc.nextLine();
		StringTokenizer st = new StringTokenizer(day, ",/- ");
		while (st.hasMoreTokens()) {
			s2 = st.nextToken();
			s.add(s2);// Adding Date In the ArrayList as String Objects
		}
		date = Integer.parseInt(s.get(0));// Getting the Date
		s2 = s.get(1);// Getting the Month from the Date
		s2.toLowerCase();
		year = Integer.parseInt(s.get(2));// Getting Year

		if (s2 == "jan")
			month = 1;
		else if (s2 == "feb")
			month = 2;
		else if (s2 == "mar")
			month = 3;
		else if (s2 == "apr")
			month = 4;
		else if (s2 == "may")
			month = 5;
		else if (s2 == "jun")
			month = 6;
		else if (s2 == "jul" || s2 == "july")
			month = 7;
		else if (s2 == "aug")
			month = 8;
		else if (s2 == "sep" || s2 == "sept")
			month = 9;
		else if (s2 == "oct")
			month = 10;
		else if (s2 == "nov")
			month = 11;
		else
			month = 12;

		n = date + month + year;

		while (n > 0) {
			while (n != 0) {
				rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			if (sum > 9) {
				n = sum;
				sum = 0;
			}
		}
		System.out.println("Your Lucky Number is: " + sum);
		sc.close();
	}

}
