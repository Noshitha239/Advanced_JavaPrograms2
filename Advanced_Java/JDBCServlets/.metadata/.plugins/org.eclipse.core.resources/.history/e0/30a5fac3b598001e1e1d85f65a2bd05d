package com.gqt.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping("menuForm")
	public String menuPage() {
		return "hello-form";
	}
	@RequestMapping("/processform")
	public String processPage(@RequestParam("studentName") String tempstudentName, Model model) {
		tempstudentName  = tempstudentName.toUpperCase();
		String message="Hello "+tempstudentName;
		model.addAttribute("tempName", message);
		return "hello-display";
	}

}
