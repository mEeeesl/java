package ch07.ex08;

import java.util.ArrayList;
import java.util.List;

import ch07.ex08.dao.ScoreDao;
import ch07.ex08.dao.ScoreDaoImpl;
import ch07.ex08.domain.Score;
import ch07.ex08.presentation.ScoreIo;
import ch07.ex08.service.ScoreService;
import ch07.ex08.service.ScoreServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Score> scores = new ArrayList<>();
		
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.play();
		
	}
}
// a has a b
// has a 가 곤란하면 a extesnds b
// is a가 has a 보다 낫다고 함