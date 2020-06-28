package com.spring.review.repository;

import java.util.List;

import com.spring.review.vo.ScoreVO;

public interface IScoreDAO {
	void insert(ScoreVO score);

	List<ScoreVO> getList();

	ScoreVO find(int index);


	void delete(int index);
}
