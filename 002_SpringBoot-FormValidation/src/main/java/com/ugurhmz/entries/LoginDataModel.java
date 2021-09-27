package com.ugurhmz.entries;




public class LoginDataModel {

	private String userName;
	private String password;
	
	
	
	// GETTER SETTER
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return  userName + " " + password ;
	}
	
	
	
	
}
