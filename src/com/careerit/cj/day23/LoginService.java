package com.careerit.cj.day23;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {

	private String name;
	private String username;
	private String password;
	private String email;

	public User(String name, String username, String password, String email) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

public class LoginService {
	Map<String, User> map = new HashMap<String, User>();

	public LoginService() {
		List<User> users = getUserData();
		for (User user : users) {
			map.put(user.getUsername(), user);
		}
	}

	public User login(String username, String password) {
		User user = map.get(username);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				return user;
			}
		}

		throw new IllegalArgumentException("Bad credentials");
	}

	private List<User> getUserData() {
		return List.of(new User("Krish", "krishna", "krishna@123", "krish.t@gmail.com"),
				new User("Krish", "krishna", "krishna@123", "krish.t@gmail.com"),
				new User("Manoj", "manoj", "manoj@123", "manoj.pvn@gmail.com"),
				new User("Sai", "sai", "sai@123", "sai.a@gmail.com"),
				new User("Anish", "anish", "anish@123", "anish.v@gmail.com"),
				new User("Balu", "balu", "balu@123", "balu@gmail.com"));
	}
}
