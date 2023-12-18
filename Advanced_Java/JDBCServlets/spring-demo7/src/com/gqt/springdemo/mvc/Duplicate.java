package com.gqt.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Duplicate {
	@RequestMapping("/")
	public String menuPage() {
		return "main-menu";
	}
	@RequestMapping("processform")
	public String showPage(HttpServletRequest request,Model model) {
		System.out.println("Show page - Duplicate Controller");
		return "display-menu";
	}


}
