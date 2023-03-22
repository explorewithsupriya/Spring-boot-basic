package com.supriya.model;

public class UserDetails  extends ResponseUtil{

	
	private String userMob;
	private String userName;
	private String useAge;
	public String getUserMob() {
		return userMob;
	}
	public void setUserMob(String userMob) {
		this.userMob = userMob;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUseAge() {
		return useAge;
	}
	public void setUseAge(String useAge) {
		this.useAge = useAge;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String userMob, String userName, String useAge) {
		super();
		this.userMob = userMob;
		this.userName = userName;
		this.useAge = useAge;
	}
	
	
}
