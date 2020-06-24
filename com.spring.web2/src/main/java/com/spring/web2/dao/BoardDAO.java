package com.spring.web2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.web2.model.BoardVO;

@Repository
public class BoardDAO implements IBoardDAO {

	private List<BoardVO> list = new ArrayList<BoardVO>();
	
	@Override
	public void insert(BoardVO board) {
		list.add(board);
	
	}

	@Override
	public List<BoardVO> getList() {
		return list;
	}

	@Override
	public BoardVO getContent(int index) {
		return list.get(index);
	}

	@Override
	public void deleteBoard(int index) {
		list.remove(index);

	}

	@Override
	public BoardVO modify(BoardVO board, int index) {
		list.get(index).setUserId(board.getUserId());
		list.get(index).setTitle(board.getTitle());
		list.get(index).setContent(board.getContent());
		System.out.println(board);
		return board;
	}

}
