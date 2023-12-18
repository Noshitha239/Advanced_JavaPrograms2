package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.gqt.model.CustomerCar;

public class CheckServiceStatus extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession();
		String un=(String)session.getAttribute("sun");
	
		CustomerCar tempcustomer = new CustomerCar();
		tempcustomer.setUn(un);
		
		String status=tempcustomer.checkStatus();
		session.setAttribute("sstatus",status);
		response.sendRedirect("/car_service_system/checkStatusCompleted.jsp");
		
//		if(status.equals(status)) {
//			response.sendRedirect("/car_service_system/checkStatusCompleted.jsp");
//		}
//		else if(!status.equals(status)) {
//			response.sendRedirect("/car_service_system/checkStatusPending.jsp");
//		}
//		else {
//			response.sendRedirect("/car_service_system/checkStatusFailure.html");
//		}
		
	}


}
