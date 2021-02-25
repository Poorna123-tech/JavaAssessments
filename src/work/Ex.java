package work;

import java.util.*;

public interface Ex {
    public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("pspk");
		l.add("amirkhan");
		l.add("anushka");
		l.add("prabhas");
		System.out.println(l);
		ListIterator<String> i = l.listIterator();
		while(i.hasNext()) {
			String s = (String)i.next();
			if(s.equals("prabhas"))
				i.remove();
			else if(s.equals("pspk"))
				i.set("poornasreepavankalyanllk");
			if(s.equals("poornasree"))
				i.add("pavankalyan");
		}System.out.println(l);
		
		
	}
}
