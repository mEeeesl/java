package ch07.ex08.dao;

import java.util.List;

import ch07.ex08.domain.Score;

public class ScoreDaoImpl implements ScoreDao {
	private List<Score> scores;
	
	public ScoreDaoImpl(List<Score> scores) {
		this.scores = scores;
	}
	
	
	@Override
	public void insertScore(Score score) {
		scores.add(score);
	}
	
	@Override
	public List<Score> selectScores () {
		return this.scores;
	}
}
// 표 = List 
// record ( 각 점수들 ) = generic type 
//dao에서는 테이블에 있는 데이터를 읽고있다 정도