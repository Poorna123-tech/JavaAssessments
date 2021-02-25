package assignment;

import java.util.*;

public class Mainn {
	
	public static void main(String[] args) {

		HashMap<String, User> usersList = new HashMap<String, User>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter to login or register");
		String n = sc.next();
		if(n.equals("login")) {
		String userId;
		String password;
			System.out.println("Enter User ID");
			userId = sc.next();

			System.out.println("Enter Password");
			password = sc.next();
			
			if (usersList.containsKey(userId)) {
				// existing user
				User existingUser = usersList.get(userId);
				if (existingUser.getPassword().equals(password))
					System.out.println("Login sucessful");
				else {
					System.out.println("Login unsuccessful");
					System.out.println("Forgot password? (Yes/No)");
					if (sc.next().equals("Yes")) {
						ForgotPassword forgotPwd = new ForgotPassword();
						String newPassword = forgotPwd.process();
						if (!newPassword.equals("")) {
							existingUser.setPassword(newPassword);
							System.out.println("Password changed successfully");
						}
					}
				}
			}} else if(n.equals("register")) {
							
				 String LastName = null;

				 
					User user = new User();
					Validation validation = new Validation();

					// User Id
					int count = 0;
					
					  String userId = " ";
					while (!(validation.validateUserId(userId))) { count++; if (count == 3)
					  return ; else { System.out.println("Invalid userId. Try again"); userId =
					  sc.next(); } }
					 		user.setUserid(userId);

					// Password
					 count = 0;
						
						  while (!(validation.validatePassword(userId))) { count++; if (count == 3)
						  return ; else { System.out.println("Invalid Password. Try again"); userId
						  = sc.next(); } }
						 
					String password = " ";
					user.setPassword(password);
					
					// First Name
					System.out.println("Enter first name");
					String firstName = sc.next();
					count = 0;
					
					  while (!validation.validateFirstName(firstName)) { count++; if (count == 3)
					  return ; 
					  else { System.out.println("Invalid Firstname. Try again");
					  userId = sc.next(); } }
					 
					user.setFirstname(firstName);

					// Last name
					System.out.println("Enter Last name");
					String lastName = sc.next();
					count = 0;
					
					  while (!(validation.validateLastName(lastName))) { count++; if (count == 3)
					  return ; else { System.out.println("Invalid matches. Try again");
					  LastName = sc.next(); } }
					 
					user.setLastname(LastName);

					// Email
					System.out.println("Enter email id");
					String email = sc.next();
					count = 0;
					boolean b = Validation.validateEmail(email);
					
					  while (!b) { count++; if (count == 3) return; else { System.out.
					  println("Should contain atleast one uppercase[A-Z], one lowercase[a-z], one special characters[@,_,&], onenumerics[0-9]"
					  ); 
					  LastName = sc.next(); } }
					 
					user.setEmailid(email);
					
					//Mobile number
					System.out.println("Enter mobile number");
					long mobileNo = sc.nextLong();
					count = 0;
					
					  while (!validation.validateMobileNumber(mobileNo)) { count++; if (count == 3)
					  return; else { System.out.println("Mobile number should be 10 digits");
					  mobileNo = sc.nextLong(); } }
					 
					user.setMobilenumber(mobileNo);
					
					return;
				}else {
					System.out.println("Enter FirstName");
					String a = sc.next();
					System.out.println("Enter LastName");
					String b = sc.next();
					System.out.println("Enter EmailId");
					String c = sc.next();
					System.out.println("Enter MobileNumber");
					long d = sc.nextLong();
					System.out.println("Enter Userid");
					String e = sc.next();
					System.out.println("Enter Password");
					String f = sc.next();
					
					Validation validate = new Validation();
					if(validate.validateFirstName(a)&validate.validateLastName(b)&validate.validateEmail(c)&validate.validateMobileNumber(d)&validate.validateUserId(e)&validate.validatePassword(f)) {
						usersList.put(e,new User(a,b,c,e,f,d));
						System.out.println("Account created successfully");
					}
					
				}

			}
			
		
		
	}


