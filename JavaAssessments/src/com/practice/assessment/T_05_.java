package com.practice.assessment;

import java.util.Scanner;

public class T_05_ {
	public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input :");
        String s = sc.next();
        boolean flag = false;
        for(int i = 0; i<s.length(); i++){
            Character s1 = s.charAt(i);
            int ascii = (int) s1;
            if(ascii>=65&&ascii<=90 || ascii>=97&&ascii<=122){
                
            }
            else 
            {
                flag = true;
            }
            
        }if (flag == true){
            System.out.print("String consists other than alphabets");
            
        }
        else {
            System.out.print("String consists only alphabets");
        }
        sc.close();
    }
}
