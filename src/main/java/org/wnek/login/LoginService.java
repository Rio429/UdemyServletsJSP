package org.wnek.login;

public class LoginService {
	public boolean isValid(String userName, String password) {
		if(userName.equals("Wojciech") && password.equals("pass"))
			return true;
		return false;
	}
}
