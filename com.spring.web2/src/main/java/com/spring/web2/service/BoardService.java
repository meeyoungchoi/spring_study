package com.spring.web2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web2.dao.IBoardDAO;
import com.spring.web2.model.BoardVO;

@Service
public class BoardService implements IBoardService {
	@Autowired
	private IBoardDAO dao;

	@Override
	public void insert(BoardVO board) {
		dao.insert(board);
		System.out.println(board);
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return dao.getList();
	}

	@Override
	public BoardVO getContent(int index) {
		return dao.getContent(index - 1);
	}

	@Override
	public void deleteBoard(int index) {
		dao.deleteBoard(index - 1);

	}

	@Override
	public BoardVO modify(BoardVO board, int index) {
		return dao.modify(board, index - 1);
	}

}
