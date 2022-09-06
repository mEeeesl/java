package ch07.ex08.presentation;

import java.util.List;

import ch07.ex08.domain.Score;
import ch07.ex08.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo (ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		// for 블럭 바깥에 선언한 이유는, 선언도 3번함
		for(int i = 0; i < 3; i++) {
			korScore = Console.inNum("국어 점수를 입력하세요");
			engScore = Console.inNum("영어 점수를 입력하세요");
			mathScore = Console.inNum("수학 점수를 입력하세요");
			
			Score score = new Score(korScore, engScore, mathScore);
			scoreService.addScore(score);
		}
		
		List<Score> scores = scoreService.getScores();	// 점수표
		for(Score score: scores)
			System.out.println(score);
	}
}
