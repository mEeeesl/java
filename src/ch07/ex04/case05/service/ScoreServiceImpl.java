package ch07.ex04.case05.service;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.domain.Score;

public class ScoreServiceImpl implements ScoreService{
	private ScoreDao scoreDao; //얘도 dao에 있는걸받아서 실행할수있음.
	
	public ScoreServiceImpl() {} //test를 위해서 쓴코드임
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao; //DI
	}
	
	@Override
	public void addScore(Score score) { 
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScore() { //외부의 프레젠테이션 객체가 콜함.
		Score[] scores = scoreDao.selectScores();
		this.calcScore(scores); //calcScore 실행하면 합계,평균 생김
		return scores;
	}
	
	public void calcScore(Score[] scores) {
		for(int i = 0; i < scores.length; i++) {
			scores[i].setSum(
					scores[i].getKorScore() + 
					scores[i].getEngScore() + 
					scores[i].getMathScore());
			scores[i].setAvg(scores[i].getSum() / 3);
		}
	}
}

//calcScore - private면 내부에서만 콜함.