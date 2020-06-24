package com.spring.web2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.web2.model.BoardVO;
import com.spring.web2.service.BoardService;
import com.spring.web2.service.IBoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private IBoardService service;
	
	
	@GetMapping("/write")
	public void write() {
		
	}
	
	@PostMapping("/write")
	public String write(BoardVO board) {
		System.out.println("/board/write: POST");
		System.out.println(board);
		service.insert(board);
		
		return "redirect:/board/list";
		
		
	}
	
	
	@GetMapping("/list")
	public void list(Model model) {
		
		List<BoardVO> boards = service.getList();
		System.out.println(boards);
		model.addAttribute("boards", boards);
		
		
		
	}
	
	@GetMapping("/show")
	public String show(@ModelAttribute("boardNo")int boardNo, Model model) {
		model.addAttribute("board", service.getContent(boardNo));
		return "board/show";
	}
	
	@GetMapping("/update")
	public String update(BoardVO board, int boardNo) {
		System.out.println("/board/update: GET");
		System.out.println(board);
		service.modify(board, boardNo);
		return "redirect:/board/list";
	}
	
	@GetMapping("/delete")
	public String delete(int boardNo) {
		System.out.println("/board/delete: GET");
		service.deleteBoard(boardNo);
		return "redirect:/board/list";
	}
	
	
}
