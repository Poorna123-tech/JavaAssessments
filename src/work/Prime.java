package work;

import java.util.Scanner;

public class Prime {
   public static void main(String args[]) {
	   Prime p = new Prime();
	   Scanner sc=new Scanner(System.in);
	   
	   int n = 0;
	   System.out.println("Enter the number of primes to be printed");
	   try {
		   n=sc.nextInt();
	   }catch(Exception e) {
		   sc.next();
		   System.out.println("Enter valid number as input and try again");
	   }
	   boolean flag;
	   for (int i = 2, count = 0; count<n; i++) {
		   	flag = p.prime(i);
		   	if (flag == false) {
		   		System.out.print(i + " ");
		   		count++;
		   	}
	   }
	   System.out.println();
	   
	   int m = 0;
	   System.out.println("Enter the number of prime to be printed");
	   try {
		   m=sc.nextInt();
	   }catch(Exception e) {
		   System.out.println("Enter valid number as input and try again");
	   }
	   for (int i = 2, count = 0; count<m; i++) {
		   	flag = p.prime(i);
		   	if (flag == false) {
		   		count++;
		   		if(count == m) {
		   			System.out.print(i);
		   		}
		   	}
	   } 
	   
	   sc.close();
   }
   
   public boolean prime(int n) {
	   for (int j = 2; j<n ; j++) {
		   if (n%j == 0) {
			   return true;		  
		   }
	   }
	   return false;
   }
}
