package com.gqt.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.model.Student;

public class Insert extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String tempid=request.getParameter("id");
		String tempname=request.getParameter("name");
		String tempmarks1=request.getParameter("marks1");
		String tempmarks2=request.getParameter("marks2");
		String tempmarks3=request.getParameter("marks3");
		//orif(tempid.length()!=0)
		if(tempid.isEmpty()||tempname.isEmpty()||tempmarks1.isEmpty()||tempmarks2.isEmpty()||tempmarks3.isEmpty()) {
			response.sendRedirect("/resultmvc1/Inserterror.html");
		}
		else {
			int id=Integer.parseInt(tempid);
			String name=tempname;
			int marks1=Integer.parseInt(tempmarks1);
			int marks2=Integer.parseInt(tempmarks2);
			int marks3=Integer.parseInt(tempmarks3);
			
			Student tempStudent = new Student();
			tempStudent.setId(id);
			tempStudent.setName(name);
			tempStudent.setMarks1(marks1);
			tempStudent.setMarks2(marks2);
			tempStudent.setMarks3(marks3);
			
			int row=tempStudent.insert();
//			id = tempStudent.getId();
//			name = tempStudent.getName();
//			marks1 = tempStudent.getMarks1();
//		    marks2 = tempStudent.getMarks2();
//		    marks3 = tempStudent.getMarks3();
//			
//			HttpSession session = request.getSession();
//			session.setAttribute("sid", id);
//			session.setAttribute("sname", name);
//			session.setAttribute("smarks1", marks1);
//			session.setAttribute("smarks2", marks2);
//			session.setAttribute("smarks3", marks3);
				
			if(row == 0) {
				response.sendRedirect("/resultmvc1/failure1.html");
			}
			else {
				response.sendRedirect("/resultmvc1/success.html");
			}		
		}
	}
}

