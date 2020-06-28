package com.spring.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.review.repository.IScoreDAO;
import com.spring.review.vo.ScoreVO;

@Service
public class ScoreService implements IScoreService {

	@Autowired
	private IScoreDAO dao;
	
	@Override
	public void insert(ScoreVO score) {
		System.out.println(score.toString());
		score.calculate();
		dao.insert(score);
		System.out.println(score.toString());
	}

	@Override
	public List<ScoreVO> getList() {
		return dao.getList();
	}

	@Override
	public ScoreVO find(int stuNum) {
		return dao.find(stuNum - 1);
	}

	@Override
	public void delete(int index) {
		dao.delete(index - 1);
		
	}

}
