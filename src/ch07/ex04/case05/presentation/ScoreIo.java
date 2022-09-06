package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		int korScore = 0;	// Di - �ʱ�ȭ
		int engScore = 0;	// �̷��� ���������δ�ƾ� for ��� ������ 
		int mathScore = 0;	// �Ⱦ�����
		
		for(int i = 0; i < 5; i++) {	// �̷��������ؾ� ���� 5������
			korScore = Console.inNum("��������");
			engScore = Console.inNum("��������");
			mathScore = Console.inNum("��������");
		
		scoreService.addScore(new Score(korScore, engScore, mathScore));
		}
		
		System.out.println("   ����   ����   ����  �հ�  ���");
		System.out.println("  --------------------------");
		
		Score[] scores = scoreService.getScore();
		System.out.println();
		for(Score score: scores)
			System.out.println(score);
	}
}
