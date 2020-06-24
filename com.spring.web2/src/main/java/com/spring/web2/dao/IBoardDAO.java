package com.spring.web2.dao;

import java.util.List;

import com.spring.web2.model.BoardVO;

public interface IBoardDAO {
	void insert(BoardVO board);
	
	
	List<BoardVO> getList();
	
	
	BoardVO getContent(int index);
	
	void deleteBoard(int index);
	
	BoardVO modify(BoardVO board , int index);
	
}
