package com.practice.luckynumber;
	import java.util.*;
public class LuckyNumber01 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter date: dd-MMM-YYYY");
		String date = sc.next();
		int luckyNum = getLuckyNumber(date);
		System.out.println(luckyNum);
		sc.close();
	}

	public static int getLuckyNumber(String date) {
		String num = "";
		String[] dateSplit= date.split("-");
		for(int i=0; i<dateSplit.length; i++) {
			if(i==1) {
				num = num + convertMMMtoMM(dateSplit[i]);
			}
			else	
				num = num + dateSplit[i];
		}
		
		int luckyNum = Integer.parseInt(num);
		while(luckyNum >=10)
			luckyNum = getSumOfDigits(luckyNum);
		
		return luckyNum;
		// ADD YOUR CODE HERE
	}

	public static int convertMMMtoMM(String mon) {
		if (mon.equalsIgnoreCase("jan") || mon.equalsIgnoreCase("January"))
			return 1;
		else if (mon.equalsIgnoreCase("feb"))
			return 2;
		else if (mon.equalsIgnoreCase("mar"))
			return 3;
		else if (mon.equalsIgnoreCase("apr"))
			return 4;
		else if (mon.equalsIgnoreCase("may"))
			return 5;
		else if (mon.equalsIgnoreCase("jun"))
			return 6;
		else if (mon.equalsIgnoreCase("jul"))
			return 7;
		else if (mon.equalsIgnoreCase("aug"))
			return 8;
		else if (mon.equalsIgnoreCase("sep"))
			return 9;
		else if (mon.equalsIgnoreCase("oct"))
			return 10;
		else if (mon.equalsIgnoreCase("nov"))
			return 11;
		else if(mon.equalsIgnoreCase("dec"))
			return 12;
		else
			return 0;

		// ADD YOUR CODE HERE
	}

	public static int getSumOfDigits(int num) {
		int sum = 0;
		while(num > 0) {
			sum = sum + (num%10);
			num = num/10;
		}
		
		return sum;
		// ADD YOUR CODE HERE
	}

}
