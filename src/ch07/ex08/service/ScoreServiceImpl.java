package ch07.ex08.service;

import java.util.List;

import ch07.ex08.dao.ScoreDao;
import ch07.ex08.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}

	@Override
	public List<Score> getScores() {
		List<Score> scores = scoreDao.selectScores();
		this.calcScore(scores);
		
		return scores;
	}
							//람다의 원소는 데이터이다
	private void calcScore(List<Score> scores) {
		scores.forEach(scoreQWE -> { //원래는 score였는데 이건 임의지정가능
			scoreQWE.setSum(
					scoreQWE.getKorScore() +
					scoreQWE.getEngScore() +
					scoreQWE.getMathScore());
			scoreQWE.setAvg(
					scoreQWE.getSum() / 3);
		});
	}
}
//dao에서는 테이블에 있는 데이터를 읽고있다 정도
//service 에서는 점수까지 읽고있다.