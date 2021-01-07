package com.rahul.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping("/showForm")
	public String showForm() {
		return "hello-world-form";
	}
	
	@GetMapping("/processForm")
	public String processForm(@RequestParam("studentName") String theName, Model model) {
		model.addAttribute("message",theName.toUpperCase());
		return "hello-world";
	}

}
