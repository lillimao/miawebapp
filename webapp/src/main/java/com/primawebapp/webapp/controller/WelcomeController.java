package com.primawebapp.webapp.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@Value("${welcome.hello}")
	public String welcomeHello;
	
	@Value("${clicktocalculate.btn}")
	public String clicktocalculate;
	
	@GetMapping("/")
	public String welcome(Model model){
		model.addAttribute("hello", welcomeHello);
		model.addAttribute("clicktocalculate", clicktocalculate);
		return "welcome";
	}
}
