package com.gqt.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String menuPage() {
		return "main-menu";
	}

	@RequestMapping("processform")
	public String showPage(HttpServletRequest request,Model model) {
		String tempStudentName = request.getParameter("studentName");
		tempStudentName=tempStudentName.toUpperCase();
		String result= "Hello " + tempStudentName;
		model.addAttribute("modelStudentName", result);
		return "display-menu";
	}
	
}
