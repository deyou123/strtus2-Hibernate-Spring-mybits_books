package com.zdy.chapter04.service;

import com.zdy.chapter04.dao.AdminDao;

public class AdminService {
	AdminDao adminDao = new AdminDao();
	public boolean login(String loginName,String loginPwd){
		return adminDao.login(loginName, loginPwd);
		
	}
}
