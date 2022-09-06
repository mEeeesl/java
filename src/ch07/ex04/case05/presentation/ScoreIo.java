package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		int korScore = 0;	// Di - 초기화
		int engScore = 0;	// 이렇게 지역변수로담아야 for 블록 끝나도 
		int mathScore = 0;	// 안없어짐
		
		for(int i = 0; i < 5; i++) {	// 이런식으로해야 변수 5번생성
			korScore = Console.inNum("국어점수");
			engScore = Console.inNum("영어점수");
			mathScore = Console.inNum("수학점수");
		
		scoreService.addScore(new Score(korScore, engScore, mathScore));
		}
		
		System.out.println("   국어   영어   수학  합계  평균");
		System.out.println("  --------------------------");
		
		Score[] scores = scoreService.getScore();
		System.out.println();
		for(Score score: scores)
			System.out.println(score);
	}
}
