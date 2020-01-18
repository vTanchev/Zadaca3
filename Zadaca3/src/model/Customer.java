package model;

public class Customer {
	
	private String firstname;
	private String lastname;
	private String email;
	private boolean prefersEmails;
			
	public Customer(String firstname, String lastname, String email, boolean prefersEmails) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.prefersEmails = prefersEmails;
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isPrefersEmails() {
		return prefersEmails;
	}
	public void setPrefersEmails(boolean prefersEmails) {
		this.prefersEmails = prefersEmails;
	}

}
