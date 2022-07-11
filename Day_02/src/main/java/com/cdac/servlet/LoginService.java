package com.cdac.servlet;

public class LoginService {

	public boolean loginCheck(String username, String password) {
		if(username.equals("Ajinkya") && password.equals("123"))
			return true;
		return false;
	}

}

