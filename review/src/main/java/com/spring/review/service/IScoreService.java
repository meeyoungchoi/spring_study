package com.spring.review.service;

import java.util.List;

import com.spring.review.vo.ScoreVO;

public interface IScoreService {
	void insert(ScoreVO score);
	
	List<ScoreVO> getList();
	
	ScoreVO find(int index);
	
	
	void delete(int index);
	
}
