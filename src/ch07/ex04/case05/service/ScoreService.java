package ch07.ex04.case05.service;

import ch07.ex04.case05.domain.Score;

public interface ScoreService {
	void addScore(Score score);
	Score[] getScore();
}


/*
서비스에서의 추가: add
서비스에서의 읽기: get
*/