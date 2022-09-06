package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public class ScoreDaoImpl implements ScoreDao{
	private Score[] scores;
	private int cursor;
	
	public ScoreDaoImpl(Score[] scores) {
		this.scores = scores;	
	}
	
	@Override 
	public void insertScore(Score score) { //인서트스코어의 제한값은 디폴트, 따라서 한단계 위인 public을 써준다.
		this.scores[cursor++] = score;
	}
	
	@Override
	public Score[] selectScores() {
		return this.scores;
	}
}

//Dao는 단위테스트를 해봐야한다.
//합계,평균구하는것을 서비스라 간주하고 한다.