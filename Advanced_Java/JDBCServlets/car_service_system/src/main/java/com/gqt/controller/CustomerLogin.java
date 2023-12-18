package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.Admin;
import com.gqt.model.Customer;
import com.gqt.model.Customer1;

public class CustomerLogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un=request.getParameter("un");
		String pwd=request.getParameter("pwd");
		
		Customer1 tempcustomer = new Customer1();
		tempcustomer.setUn(un);
		tempcustomer.setPwd(pwd);
		int res=tempcustomer.customerLogin() ;
		
		HttpSession session=request.getSession();
		session.setAttribute("sname", tempcustomer.getName());
		session.setAttribute("sun", tempcustomer.getUn());
		
		if(res==1) {
			response.sendRedirect("/car_service_system/LoginSuccess.jsp");
		}
		else if(res==-1) {
			response.sendRedirect("/car_service_system/customerincorrectPassword.html");
		}
		else {
			response.sendRedirect("/car_service_system/customerincorrectUsername.html");
		}
		
	}

}
