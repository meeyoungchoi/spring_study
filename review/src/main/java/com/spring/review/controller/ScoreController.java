package com.spring.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.review.service.IScoreService;
import com.spring.review.vo.ScoreVO;

@Controller
@RequestMapping("/score")
public class ScoreController {
	
	@Autowired
	private IScoreService service;
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	@PostMapping("/register")
	public String result(ScoreVO score) {
		service.insert(score);
		return "score/write-result";
	}
	
	@GetMapping("/result")
	public String show(Model model) {
		System.out.println("/score/result: GET");
		model.addAttribute("scores", service.getList());
		return "score/result";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("stuNum") int index) {
		service.delete(index);
		
		return "redirect:/score/result";
		
	}
	
	@GetMapping("/search")
	public void search2() {
		
	}
	
	@PostMapping("/search")
	public String search(@ModelAttribute("stuNum") int stuNum , Model model) {
		model.addAttribute("stu", service.find(stuNum));
		return "score/search-result";

	}	
}
