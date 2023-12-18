package com.gqt.springdemo.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HomeController {
	@RequestMapping("/")
	public String menuPage() {
		return "main-menu";
	}

	@RequestMapping("processform")
	public String showPage() {
		System.out.println("Show page - Home Controller");
		return "display-menu";
	}


}
