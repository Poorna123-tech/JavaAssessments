package assignment;

public class User {
	private String firstname, lastname, emailid, userid, password;
	private long mobilenumber;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	
	  public User(String firstname, String lastname, String emailid, String userid,
	  String password, long mobilenumber) { super(); this.firstname = firstname;
	  this.lastname = lastname; this.emailid = emailid; this.userid = userid;
	  this.password = password; this.mobilenumber = mobilenumber; }
	 

	public User() {
		// TODO Auto-generated constructor stub
	}

}
