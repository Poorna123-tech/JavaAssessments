package com.practice.assessment;

import java.util.ArrayList;

public class T_04_UniqueCharacters {
	 public static void main(String args[]) {
		 T_04_UniqueCharacters u=new T_04_UniqueCharacters();
	        u.findUnique("AMSTERDAM");
	        u.findUnique("ILLIIONOS");
	        u.findUnique("COSMOS");
	        u.findUnique("EPIDEMICPANDEMIC");
	    }
	    
	    public void findUnique(String s) {
	        boolean flag;
	        ArrayList<String> list = new ArrayList<String>();
	        for(int i=0; i<s.length();i++){
	            flag = false;
	            for(int j = 0; j<list.size() && flag == false ;j++){
	                String s1 = s.charAt(i)+"";
	                if(s1.equals(list.get(j)))
	                {
	                    flag = true;
	                }
	            }
	            if(flag == false) {
	                list.add(s.charAt(i)+"");
	                System.out.print(s.charAt(i));   
	            }    
	        }
	        System.out.println();
	    }
	}


