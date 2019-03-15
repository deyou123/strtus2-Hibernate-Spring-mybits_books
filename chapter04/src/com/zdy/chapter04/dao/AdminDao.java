package com.zdy.chapter04.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao extends BaseDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	public boolean login(String loginName,String loginPwd){
		boolean isLogin = false;
		String sql = "select * from admin where loginName = ? and loginPwd = ? ";
		
		try {
			conn = this.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginName);
			pstmt.setString(2, loginPwd);
			rs=pstmt.executeQuery();
			if(rs.next()){
				isLogin = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll(conn, pstmt, rs);
		}
		
		return isLogin;
		
	}
	 
}
