package com.careerit.cj.day22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UserDetails{
	
	private String username;
	private String password;
	private String email;
	public UserDetails(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
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

class UserServiceImpl{
	
		private List<UserDetails> list;
		private Map<String, UserDetails> map;
		
		public UserServiceImpl() {
			list = getRegistredUsers();
			map = new HashMap<String, UserDetails>();
			list.stream().forEach(ele->{
				map.put(ele.getUsername(),ele);
			});
		}
		public UserDetails login(String username,String password) {
			UserDetails user = map.get(username);
			if(user==null)
				throw new IllegalArgumentException("Bad credentials");
			else {
				if(user.getPassword().equals(password)) {
					return user;
				}
			}
			throw new IllegalArgumentException("Bad credentials");
		}

		private List<UserDetails> getRegistredUsers() {
			List<UserDetails> list = new ArrayList<UserDetails>();
			String data = "Krish,Manoj,Charan,Jayesh,Suresh,Mahesh,John,Tom";
			for(String name:data.split(",")) {
				list.add(new UserDetails(name.toLowerCase(), name.toLowerCase()+"@123", name.toLowerCase()+"@lwl.com"));
			}
			return list;
		}
	
}


public class LoginService {

		public static void main(String[] args) {
			UserServiceImpl userService = new UserServiceImpl();
			UserDetails user = userService.login("krish", "krish@123");
			System.out.println(user.getEmail());
		}
}
