package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.model.Admin;

public class AdminLogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String admin_uname=request.getParameter("admin_uname");
		String admin_password=request.getParameter("admin_password");
		
		Admin tempAdmin = new Admin();
		tempAdmin.setAdmin_uname(admin_uname);
		tempAdmin.setAdmin_password(admin_password);
		
		int res=tempAdmin.adminLogin();
		if(res==1) {
			response.sendRedirect("/car_service_system/adminLoginSuccess.jsp");
		}
		else if(res==-1) {
			response.sendRedirect("/car_service_system/incorrectPassword.html");
		}
		else {
			response.sendRedirect("/car_service_system/incorrectUsername.html");
		}
	}
}
