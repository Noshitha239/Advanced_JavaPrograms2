package com.gqt.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/std")
public class StudentController {
	@RequestMapping("menuForm")
	public String menuPage(Model model) {
		Student s=new Student();
		model.addAttribute("tempStudent", s);
		return "student-form";
	}
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("tempStudent") Student stud) {
		System.out.println("First Name is "+ stud.firstName);
		System.out.println("Last Name is "+ stud.lastName);
		System.out.println("Country is "+ stud.country);
		System.out.println("Favourite Subject is "+stud.subject);
		return "student-display";
	}

}
