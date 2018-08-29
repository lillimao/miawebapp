package com.primawebapp.webapp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@Value("${welcome.hello}")
	public String welcomeHello;
	
	@Value("${cliccami.btn}")
	public String cliccami;
	
	@GetMapping("/")
	public String welcome(Model model){
		model.addAttribute("hello", welcomeHello);
		model.addAttribute("cliccami", cliccami);
		return "welcome";
	}
}
