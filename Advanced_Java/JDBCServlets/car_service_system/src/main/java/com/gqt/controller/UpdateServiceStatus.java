package com.gqt.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.CustomerCar;

public class UpdateServiceStatus extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String un=request.getParameter("un");
		CustomerCar tempcustomer = new CustomerCar();
		tempcustomer.setUn(un);
		int rows=tempcustomer.updateStatus();
		if(rows==0) {
			response.sendRedirect("/car_service_system/updateStatusFailure.html");
		}
		else {
			response.sendRedirect("/car_service_system/updateStatusCompleted.jsp");
		}
	}
}
