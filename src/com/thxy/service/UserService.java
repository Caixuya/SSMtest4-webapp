package com.thxy.service;

public class UserService{

	public String Username;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		this.Username = username;
	}

	/*
	 * public UserService() { // TODO Auto-generated constructor stub }
	 * 
	 * public UserService(String username) { super(); this.Username = username; }
	 */
	public void sayHello() {
		if (null == Username) {
			System.out.println("Hello World");
		} else {
			System.out.println("Hello" + Username);
		}
	}

}
