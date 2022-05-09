package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/signin")
	public String login() {
		return "signin";
	}
	
	@GetMapping("/dashboard")
	public String dashbode() {
		return "dashboard";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
}
