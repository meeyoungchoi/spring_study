package com.spring.review.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.review.vo.ScoreVO;

@Repository
public class ScoreDAO implements IScoreDAO {

	private List<ScoreVO> list = new ArrayList<ScoreVO>();
	
	
	@Override
	public void insert(ScoreVO score) {
		list.add(score);

	}

	@Override
	public List<ScoreVO> getList() {
		return list;
	}

	@Override
	public ScoreVO find(int stuNum) {
		System.out.println(list.get(stuNum));
		return list.get(stuNum);
	}

	@Override
	public void delete(int index) {
		list.remove(index);

	}

}
