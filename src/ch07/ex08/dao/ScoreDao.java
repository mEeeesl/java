package ch07.ex08.dao;

import java.util.List;

import ch07.ex08.domain.Score;

public interface ScoreDao {
	void insertScore(Score score);
	List<Score> selectScores ();	// record들 
	// select는 domain이거나 list이거나 둘중 한개를 받자
}
//dao에서는 테이블에 있는 데이터를 읽고있다 정도