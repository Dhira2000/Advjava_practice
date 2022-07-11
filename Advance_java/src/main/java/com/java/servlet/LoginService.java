package com.java.servlet;

public class LoginService {

	public boolean loginCheck(String username, String password) {
		if(username.equals("dhiraj") && password.equals("1234"))
			return true;
		return false;
	}

}
