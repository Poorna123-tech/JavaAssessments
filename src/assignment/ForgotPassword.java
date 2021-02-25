package assignment;

import java.util.Scanner;

public class ForgotPassword {

	public String process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new password");
		String newPassword = sc.next();
		
		System.out.println("Reenter new password");
		String confirmPassword = sc.next();
		
		if (newPassword.equals(confirmPassword)) {
			boolean validFlag = true;
			Validation validate = new Validation();
			validFlag = validate.validatePassword(newPassword);
			if(validFlag == true) {
				return newPassword;
			}
			else 
				System.out.println("Invalid Password.");
		}
		else {
			System.out.println("Confirm password doesn't match with new password");
		}
		return "";
	}

}
