package com.greatlearning.lma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String showWelcomePage() {
		
		return "welcome-page";
	}

	@RequestMapping("/welcome2")
	public String showWelcomePage2() {
		
		return "welcome-page";
	}

}
