package org.itstep.spring;

public class User {
	private String login;
	private String pass1;
	private String pass2;
	private String email;
	

    public String getLogin() {
	    return login;
	}
	public String getPass1() {
	    return pass1;
	}
	public String getPass2() {
	    return pass2;
	}
	public String getEmail() {
	    return email;
	}
	
	public void setLogin(String login) {
	    this.login = login;        
	}
	public void setPass1(String pass1) {
	    this.pass1 = pass1;
	}
	public void setPass2(String pass2) {
	    this.pass2 = pass2;
	}
	public void setEmail(String email) {
	    this.email = email;
	} 
}
