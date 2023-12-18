package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.Customer;

public class CustomerRegister1 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String tempname=request.getParameter("Name");
		String tempun=request.getParameter("un");
		String temppwd=request.getParameter("pwd");
		String tempemail=request.getParameter("email");
		
			Customer tempCustomer = new Customer();

			tempCustomer.setName(tempname);
			tempCustomer.setUn(tempun);
			tempCustomer.setPwd(temppwd);
			tempCustomer.setEmail(tempemail);
			int row=tempCustomer.customerRegister();
			
			HttpSession session=request.getSession();
			session.setAttribute("sname", tempname);
			
			if(row == 0) {
				response.sendRedirect("/car_service_system/registerFailure.html");
			}
			else {
				response.sendRedirect("/car_service_system/registerSuccess.jsp");
			}		
		
	}

}
