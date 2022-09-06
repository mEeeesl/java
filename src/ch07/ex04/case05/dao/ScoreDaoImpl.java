package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public class ScoreDaoImpl implements ScoreDao{
	private Score[] scores;
	private int cursor;
	
	public ScoreDaoImpl(Score[] scores) {
		this.scores = scores;	
	}
	
	@Override 
	public void insertScore(Score score) { //�μ�Ʈ���ھ��� ���Ѱ��� ����Ʈ, ���� �Ѵܰ� ���� public�� ���ش�.
		this.scores[cursor++] = score;
	}
	
	@Override
	public Score[] selectScores() {
		return this.scores;
	}
}

//Dao�� �����׽�Ʈ�� �غ����Ѵ�.
//�հ�,��ձ��ϴ°��� ���񽺶� �����ϰ� �Ѵ�.