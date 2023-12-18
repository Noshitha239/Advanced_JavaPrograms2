package com.gqt.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gqt.hibernatemanager.HibernateManager;

@Controller
public class CustomerController {
	@RequestMapping("/")
	public String menuPage() {
		return "main-menu";
	}
	@RequestMapping("/newCustomer")
	public String newCustomer() {
		return "newCustomer-form";
	}
	@RequestMapping("/registerCustomer")
	public String registerCustomer(@RequestParam("name") String name,@RequestParam("password") String password ) {//@RequestParam get the value in the name
		HibernateManager hm = new HibernateManager();
		hm.register(name, password);
		return "registrationSuccess";
	}
	@RequestMapping("/existingCustomer")
	public String existingCustomer() {
		return "existingCustomer-form";
	}

	@RequestMapping("/loginCustomer")
	public String loginCustomer(@RequestParam("name") String name,@RequestParam("password") String password ) {//@RequestParam get the value in the name
		HibernateManager hm = new HibernateManager();
		int status=hm.login(name, password);
		if(status==1) {
			return "loginSuccess";
		}
		else {
			return "loginFailure";
		}
		
	}
	
	
	@RequestMapping("/updatePassword")
	public String updatePassword() {
		return "updatePassword-form";
	}
	@RequestMapping("/updateCustomer1")
	public String updateCustomer1(@RequestParam("id") String id ,@RequestParam("name") String name ,@RequestParam("newPassword") String newPassword ) {//@RequestParam get the value in the name
		HibernateManager hm = new HibernateManager();
		int status=hm.updatePassword(id,name,newPassword);
		if(status==1) {
			return "updatePasswordSuccess";
		}
		else {
			return "updatePasswordFailure";
		}
		
	}
	
}
