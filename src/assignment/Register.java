/*
 * package assignment;
 * 
 * import java.util.*;
 * 
 * public class Register {
 * 
 * private static String LastName = null;
 * 
 * public User register1(String userId, String password) {
 * 
 * Scanner sc = new Scanner(System.in); User user = new User(); Validation
 * validation = new Validation();
 * 
 * // User Id int count = 0;
 * 
 * while (!(validation.validateUserId(userId))) { count++; if (count == 3)
 * return null; else { System.out.println("Invalid userId. Try again"); userId =
 * sc.next(); } } user.setUserid(userId);
 * 
 * // Password count = 0;
 * 
 * while (!(validation.validatePassword(userId))) { count++; if (count == 3)
 * return null; else { System.out.println("Invalid Password. Try again"); userId
 * = sc.next(); } }
 * 
 * user.setPassword(password);
 * 
 * // First Name System.out.println("Enter first name"); String firstName =
 * sc.next(); count = 0;
 * 
 * while (!validation.validateFirstName(firstName)) { count++; if (count == 3)
 * return null; else { System.out.println("Invalid Firstname. Try again");
 * userId = sc.next(); } }
 * 
 * user.setFirstname(firstName);
 * 
 * // Last name System.out.println("Enter Last name"); String lastName =
 * sc.next(); count = 0;
 * 
 * while (!(validation.validateLastName(lastName))) { count++; if (count == 3)
 * return null; else { System.out.println("Invalid matches. Try again");
 * LastName = sc.next(); } }
 * 
 * user.setLastname(LastName);
 * 
 * // Email System.out.println("Enter email id"); String email = sc.next();
 * count = 0; boolean b = Validation.validateEmail(email);
 * 
 * while (!b) { count++; if (count == 3) return null; else { System.out.
 * println("Should contain atleast one uppercase[A-Z], one lowercase[a-z], one special characters[@,_,&], onenumerics[0-9]"
 * ); LastName = sc.next(); } }
 * 
 * user.setEmailid(email);
 * 
 * //Mobile number System.out.println("Enter mobile number"); long mobileNo =
 * sc.nextLong(); count = 0;
 * 
 * while (!validation.validateMobileNumber(mobileNo)) { count++; if (count == 3)
 * return null; else { System.out.println("Mobile number should be 10 digits");
 * mobileNo = sc.nextLong(); } }
 * 
 * user.setMobilenumber(mobileNo);
 * 
 * return user; } }
 */