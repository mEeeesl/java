package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public interface ScoreDao {
	void insertScore(Score score); //insert는 추가.
	Score[] selectScores(); //레코드 5개가 들어있는 1차원배열.
}
