package com.gmail.devi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class lessonControllers {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/m/{chapter}/{lesson}/{assignmentNumber}")
	public String process(@PathVariable String assignmentNumber, Model model) {
		switch(assignmentNumber) {
		case "0733":
			model.addAttribute("content", "Setting up your servers");
			return "lesson";			
		case "0345":
			model.addAttribute("content", "Coding Forms");
			return "assignment";
		case "0342":
			model.addAttribute("content", "Punch Cards");
			return "lesson";
		case "0348":
			model.addAttribute("content", "Advanced Fortran Intro");
			return "lesson";
		case "2342":
			model.addAttribute("content", "Fortran to Binary");
			return "assignment";
		default: 
			return "index";
		}
		
	}
}
