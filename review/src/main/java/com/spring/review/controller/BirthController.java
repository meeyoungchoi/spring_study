package com.spring.review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.review.vo.BirthVO;

@Controller
@RequestMapping("/birth")
public class BirthController {
	@GetMapping("/form")
	public String form() {
		return "birth/birth-form";
	}
	
	
	@PostMapping("/form")
	public void register(BirthVO birth, Model model) {
		
		String birthday = birth.getbYear() + birth.getbMonth() + birth.getbDate();
		
		System.out.println(birthday);
		model.addAttribute("birth", birth);
	}
	
}
