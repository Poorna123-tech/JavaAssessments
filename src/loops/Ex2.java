package loops;

import java.util.Scanner;

//A program which displays the sum of STRICT DIVISORS of an integer given by the user 
public class Ex2 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	//int sum = 0 ;
	for(int i =1; i<n/2; i++) {
		if(n%i==0)
			//sum += i;
		System.out.println(i + "  ");
	}
		
	sc.close();
}
}
