package jspPractice;

public class ContactInf {
	
	
	String Name;
	String Phoneno;
	String Mail;
	String Address;
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the phoneno
	 */
	public String getPhoneno() {
		return Phoneno;
	}
	/**
	 * @param phoneno the phoneno to set
	 */
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return Mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		Mail = mail;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	
	@Override
	public String toString() {
		return "ContactInf [Name=" + Name + ", Phoneno=" + Phoneno + ", Mail=" + Mail + ", Address=" + Address + "]";
	}

}
