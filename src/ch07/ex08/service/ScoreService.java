package ch07.ex08.service;

import java.util.List;

import ch07.ex08.domain.Score;

public interface ScoreService {
	void addScore(Score score);
	List<Score> getScores();
	
}
// dao에서는 테이블에 있는 데이터를 읽고있다 정도
// service 에서는 점수를 읽고있다.