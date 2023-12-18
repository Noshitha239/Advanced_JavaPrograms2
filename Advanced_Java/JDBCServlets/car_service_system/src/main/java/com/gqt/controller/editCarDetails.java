package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.CustomerCar;


public class editCarDetails extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String car_model=request.getParameter("car_model");
		String car_type=request.getParameter("car_type");
		String car_reg_no=request.getParameter("car_reg_no");
		String service=request.getParameter("service");
		String status=request.getParameter("status");
		

		CustomerCar tempCardetails = new CustomerCar();

		HttpSession session=request.getSession();
		String un=(String)session.getAttribute("sun");

		tempCardetails.setUn(un);
		tempCardetails.setCar_model(car_model);
		tempCardetails.setCar_type(car_type);
		tempCardetails.setCar_reg_no(car_reg_no);
        tempCardetails.setService(service);
        tempCardetails.setStatus(status);
		int row=tempCardetails.editService();


		if(row == 0) {
			response.sendRedirect("/car_service_system/editcarDetailsFailure.html");
		}
		else {
			response.sendRedirect("/car_service_system/editcarDetailsSuccess.jsp");
		}		
	}

}
