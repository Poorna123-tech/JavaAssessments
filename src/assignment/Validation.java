package assignment;

import java.util.regex.*;

//Checking FirstName
public class Validation {

	public boolean validateFirstName(String firstName) {
		
		String firstNameRegex = "[A-Za-z]*";
		Pattern pat = Pattern.compile(firstName);
		return pat.matcher(firstNameRegex).matches();
	}
	// Checking LastName

	public boolean validateLastName(String lastName) {
		String lastNameRegex = "[A-Z]+([ '-][a-zA-Z]+)*";
		Pattern pat = Pattern.compile(lastNameRegex);
		return pat.matcher(lastNameRegex).matches();
	}

	// checking valid email
	public static boolean validateEmail(String emailId) {
		String emailRegex = ("[a-zA-Z]+[a-zA-Z0-9]*{0,}+[@]{1}+[.]{1}+[cCoOmM]{3}");
				//String emailRegex = [a-zA-Z0-9@]
		Pattern pat = Pattern.compile(emailRegex);
		return pat.matcher(emailRegex).matches();
	}

	// Checking valid Mobile Number
	public boolean validateMobileNumber(Long mobileNumber) {
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(mobileNumber.toString());
		if (m.matches()) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean validateUserId(String userId) {

		// validation for userid

		// Regex to check valid username.
		String regex = "[A-Za-z0-9]{5,29}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(userId);
		
		if (m.matches()) {
			return true;
		}
		else {
			return false;
		}
	}

//Password
	public boolean validatePassword(String password) {
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		//String regex = "(*[A-Z]*[a-z]*[@&_]*[0-9])";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		if (m.matches()) {
			return true;
		}
		else {
			return false;
		}
	}
}
