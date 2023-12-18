package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.CustomerCar;

public class carService extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String service=request.getParameter("service");
		
			CustomerCar tempCarservice = new CustomerCar();
			
			HttpSession session=request.getSession();
			String un=(String)session.getAttribute("sun");
			
			tempCarservice.setUn(un);
			tempCarservice.setService(service);
			int row=tempCarservice.requestService();
			
			
			if(row == 0) {
				response.sendRedirect("/car_service_system/carServiceFailure.html");
			}
			else {
				response.sendRedirect("/car_service_system/carServiceSuccess.jsp");
			}		
	}

}
