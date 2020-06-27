package com.spring.review.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.review.vo.MemberVO;

@Controller
public class RequestController {
	
	@GetMapping("/request/test")
	public void intro() {
		
		
	}
	
	
	@GetMapping("/request")
	public void intro2() {
		
	}
	
	
	@GetMapping("/request/back")
	public void move() {
		System.out.println("/review/request/back: GET");
	}
	
	@PostMapping("/request/back")
	public void movePost() {
		System.out.println("/review/request/back: POST");
	}
	
	@GetMapping("/request/join")
	public void join() {
		
	}
	
	//@RequestParam을 사용해서 view에서 데이터 가져오기
//	@PostMapping("/request/join")
//	public void result(@RequestParam("userId") String id, @RequestParam("userPW") String pw, 
//			@RequestParam(value="hobbys", required=false, defaultValue = "no hobby") List<String> hobbys) {
//		System.out.println("id: " + id);
//		System.out.println("pw: " + pw);
//		System.out.println("hobbys: " + hobbys.toString());
//
//	}
	
	
	
	//커맨드 객체를 사용해서 데이터 가져오기
//	@PostMapping("/request/join")
//	public void resutl(MemberVO member) {
//		System.out.println("id: " + member.getUserId());
//		System.out.println("pw: " + member.getUserPw());
//		
//		if (member.getHobbys() == null) {
//			System.out.println("취미가 없음");
//		} else {
//			System.out.println("hobby: " + member.getHobbys());
//		}
//		
//
//	}
	
	@PostMapping("/request/join")
	public String result(@ModelAttribute("member") MemberVO member) {
		return "request/join-result";
	}
	
	
	
	
	
	@GetMapping("/quiz")
	public String quiz() {
		return "request/req-quiz";
	}
	
	
	@PostMapping("/quiz")
	public String login(@ModelAttribute("userId") String id, @ModelAttribute("userPw") String pw) {
		if (id.equals("aaaaa1234") && pw.equals("12345")) {
			return "request/login-success";
		}

		return "request/login-fail";

	}
	

	
	
	
}
