package com.zdy.chapter04.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zdy.chapter04.service.AdminService;

public class LoginServlet extends HttpServlet {

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/htmll;charset= utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		//获取登录页面请求的用户参数
		String loginName= request.getParameter("loginName");
		String loginPwd= request.getParameter("loginPwd");
		//新建一个对象
		AdminService adminService = new AdminService();
		//调用方法,登录成功返回true
		boolean islogin = adminService.login(loginName, loginPwd);
		if(islogin){
			request.setAttribute("LOGIN_NAME", loginName);
			request.getRequestDispatcher("../ch04/info.jsp").forward(request, response);
		}else{
			out.println("登录失败");
		}
		
	
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
