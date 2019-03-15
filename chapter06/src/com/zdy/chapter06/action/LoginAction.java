package com.zdy.chapter06.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String loginName;
	private String loginPwd;
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	
	
	public String execute() throws Exception {
		// 登录用户名和密码判断，此处暂时不访问数据库
		if("admin".equals(loginName) && "123".equals(loginPwd)){
			return "success";
		}else{
			return "input";
		}
		
	}
	

}
