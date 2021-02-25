package work;
import java.util.*;

public class List {
    public static void main(String[] args) {
    	  
	  ArrayList<Integer> al = new ArrayList<Integer>();
	  al.add(1);
	  for(int i = 0; i < 10; i++)
		  al.add(2);
	  System.out.println(al);
	  al.remove(4);
	  System.out.println(al);
		
	
	}
}
