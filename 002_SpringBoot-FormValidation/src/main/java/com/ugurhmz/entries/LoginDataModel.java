package com.ugurhmz.entries;



import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginDataModel {

	
	@NotBlank(message="E-mail can not be empty!!")
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Invalid email")
	private String email;
	
	
	
	@NotBlank(message="Password can not be empty!!")
	@Size(min=8, max=100, message="Password must be min 8 between max=100 characters")
	private String password;
	
	
	@AssertTrue(message="Must agree terms and conditions")
	private boolean agreed;
	
	
	
	
	
	// GETTER SETTER
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return  email + " " + password ;
	}
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	
	
}
