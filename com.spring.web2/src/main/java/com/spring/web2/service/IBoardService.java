package com.spring.web2.service;

import java.util.List;

import com.spring.web2.model.BoardVO;

public interface IBoardService {
	void insert(BoardVO board);
	
	
	List<BoardVO> getList();
	
	
	BoardVO getContent(int index);
	
	void deleteBoard(int index);
	
	BoardVO modify(BoardVO board , int index);
	
	
}
