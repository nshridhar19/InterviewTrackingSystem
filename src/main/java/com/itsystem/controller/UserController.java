package com.itsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

	@GetMapping("/login")
	public String loginForm(Model model) {
		
		//User user = new User();
		
		return "login";
	}

}
