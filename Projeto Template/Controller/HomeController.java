package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("/dashboard")
	public String dashboard(HttpServletRequest request, Model model) {
		String usuario = request.getParameter("usuario");
		System.out.println("Usuario: " + usuario);
		model.addAttribute("name", usuario);
		model.addAttribute("desc", "NADA");
		return "dashboard";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	
	@GetMapping("/quemsou")
	public String quemsou() {
		return "quemsou";
	}
	
	@GetMapping("/cadastrado")
	public String cadastrado() {
		return "cadastrado";
	}
	
	
}
