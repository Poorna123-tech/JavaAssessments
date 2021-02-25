package work;
import java.util.*;
 class Users{
	 String userName;
	 String password;
	 String email;
	 String firsName;
	 String lastName;
	 Long mobileNumber;
	
}
public class Userreg {
		HashMap<String, Users> userDetails;
       public static void main(String[] args) {
    	   Userreg reg  = new Userreg();
    	   reg.userDetails = new HashMap<>();
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter Login or Register to continue");
    	   String input = sc.next();
    	   while(input.equalsIgnoreCase("Login") || input.equalsIgnoreCase("Register")) {
	    	   System.out.println("Enter username");
	    	   String userName = sc.next();
	    	   Users existingUser=reg.userDetails.get(userName);
	    	   if (Objects.isNull(existingUser)) {
	    		   System.out.println("User name not found");
	    		   System.out.println("Do you want to create an account, Yes or No?");
	    		   String confirm = sc.next();
	    		   if (confirm.equalsIgnoreCase("Yes")) {
	        		   //registration method & and add details to
	    			   Users user = new Users();
	    			   System.out.println("Enter first name");
	    			   user.firsName = sc.next();
	    			   System.out.println("Enter last name");
	    			   user.lastName = sc.next();
	    			   
	    			   System.out.println("Enter email");
	    			   user.email = sc.next();
	    			   
	    			   System.out.println("Enter mobile number");
	    			   user.mobileNumber = sc.nextLong();
	    			   
	    			   System.out.println("Enter username");
	    			   String userNameInput = sc.next();
	    			   existingUser=reg.userDetails.get(userNameInput);
	    			   while (!Objects.isNull(existingUser)) {
	    				   System.out.println("User name already exists, please enter another username");
	    				   userNameInput = sc.next();
	    				   existingUser=reg.userDetails.get(userNameInput);
	    			   }
	    			   user.userName = userNameInput;
	    			   
	    			   System.out.println("Enter password");
	    			   user.password = sc.next();
	    			   
	    			   reg.userDetails.put(userNameInput, user);
	    			   System.out.println("Account created successfully");
	    		   }    		   
	    		   else
	    			   System.out.println("Acount not created"); 
	    	   }
	    	   else {
	    		   System.out.println("Enter Password");
	    		   String password = sc.next();
	    		   if (password.equals(existingUser.password))
	    			   System.out.println("User authenticated");
	    		   else
	    			   System.out.println("Incorrect password");
	    	   }
	    	   System.out.println();
	    	   System.out.println("Enter Login or Register to continue");
	    	   input = sc.next();
    	   }
    	   sc.close();
    	   System.out.println("Program exited");
	}
}
