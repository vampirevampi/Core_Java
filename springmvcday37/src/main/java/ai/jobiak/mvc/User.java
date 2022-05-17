package ai.jobiak.mvc;

public class User {
	
	private String fname;
	private String mobile;
	private String email;
	public User() {
		
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(String fname,String mobile, String email) {
		super();
		this.fname = fname;
		this.mobile = mobile;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", mobile=" + mobile + ", email=" + email + "]";
	}
	

}