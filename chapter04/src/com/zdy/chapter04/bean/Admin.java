package com.zdy.chapter04.bean;

public class Admin {
	private int id;
	private String loginNme;
	private String loginPwd;
	public Admin(int id, String loginNme, String loginPwd) {
		super();
		this.id = id;
		this.loginNme = loginNme;
		this.loginPwd = loginPwd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginNme() {
		return loginNme;
	}
	public void setLoginNme(String loginNme) {
		this.loginNme = loginNme;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	
}
