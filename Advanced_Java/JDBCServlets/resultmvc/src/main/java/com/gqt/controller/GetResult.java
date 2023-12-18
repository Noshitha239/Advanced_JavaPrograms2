package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gqt.model.Student;

public class GetResult extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tempId=request.getParameter("id");
		
		if(tempId.length()==0) {
			response.sendRedirect("/resultmvc/error.html");
		}
		else {
			int id = Integer.parseInt(tempId);
			
			Student tempStudent = new Student();
			tempStudent.setId(id);
			
			int row=tempStudent.getResult();
			id = tempStudent.getId();
			String name = tempStudent.getName();
			int marks1 = tempStudent.getMarks1();
			int marks2 = tempStudent.getMarks2();
			int marks3 = tempStudent.getMarks3();
			
			HttpSession session = request.getSession();
			session.setAttribute("sid", id);
			session.setAttribute("sname", name);
			session.setAttribute("smarks1", marks1);
			session.setAttribute("smarks2", marks2);
			session.setAttribute("smarks3", marks3);
			
			if(row==0) {
				response.sendRedirect("/resultmvc/failure.html");
			}
			else {
				response.sendRedirect("/resultmvc/success.jsp");
			}
		}
	}

}
