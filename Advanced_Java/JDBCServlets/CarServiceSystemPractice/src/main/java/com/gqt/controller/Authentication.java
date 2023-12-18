package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Authentication extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String adminId="adminId";
	String password="password";
		if(adminId.length()==0||password.length()==0) {
			response.sendRedirect("/CarServiceSystemPractice/error.html");
		}
		else {
			}
	}

}
