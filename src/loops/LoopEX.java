package loops;

import java.util.Scanner;

public class LoopEX{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// to read the input given by the user
		int sum = 0;
		while(true) {
			System.out.println("Enter a number");
			sum += sc.nextInt();
			if(sum > 100)
				break;
		}System.out.println("Done" + sum);
		sc.close();
	}
}