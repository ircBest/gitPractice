package com.javaclass.domain;


public class MemberVO {
	
	// 멤버변수 선언 (***** 변수명이 중요 )
	private String userid;
	private String userpass;
	private String username;
	
	// setter, getter ( 또는 Lombok 처리 )

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}	
	
	
}
