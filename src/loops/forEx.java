package loops;
// printing even numbers
public class forEx {
     public static void main(String[] args) {
    	 //printing even numbers from 1-100 in ascending order
		 for(int i = 0; i < 100; i++) {
			 if(i%2==0) {
				 System.out.println("i values from 1 to 100 :" + "  " + i );
				 
			 }
		 }
		 //printing even numbers from 100 to 1 in descending order
		 for(int i = 100; i > 0; i--) {
			 if(i%2 == 0) {
				 System.out.println("i values from 100 to 1 :" + "  " + i);
			 }
		 }
	}  
}
