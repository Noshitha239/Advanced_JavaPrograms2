package com.gqt.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String menuPage() {
		return "main-menu";
	}
	@RequestMapping("processform")
	public String showPage() {
		return "display-menu";
	}
}
