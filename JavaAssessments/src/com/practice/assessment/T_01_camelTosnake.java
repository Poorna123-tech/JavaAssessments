package com.practice.assessment;

public class T_01_camelTosnake {
	public static void main(String[] args) {
		
	    String inputString = "poornaSree";
	    
	    int length = inputString.length();
	    String outputString = inputString.charAt(0)+"";
	     for(int i=1; i<length;i++)
	     {
	    	 if(Character.isUpperCase(inputString.charAt(i))){
	    		 outputString = outputString +"_"+ inputString.charAt(i);
	    		 
	    	 }
	    	 else{
	    		 outputString = outputString + inputString.charAt(i);
	    	 }
	    	 System.out.println("camel String:" + inputString);
	    	 System.out.println("Snake String:" + outputString.toLowerCase());
	     }
		}

}
