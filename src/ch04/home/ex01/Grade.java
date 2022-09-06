package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		
		/* 과제 ]
		 * 다음 구간별로 학점을 부여하라.
		 * 98 이상 A+
		 * 94 이상 A
		 * 90 이상 A-
		 * 88 이상 B+
		 * 84 이상 B
		 * 80 이상 B-
		 * 80 미만 C
		 * --
		 * 
		 * 점수: 100
		 * A+
		 * A 3개, B 3개 중복을 제거하라.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		int tenDigit = 0;	//	10의 자리
		int oneDigit = 0;	//	1 의 자리
		String grade = "";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		tenDigit = score / 10;
		oneDigit = score % 10;
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
			else if(0 <= oneDigit && oneDigit < 4) grade += "-";
		}
		System.out.println(grade);
		
		/*
		 if(tenDigit >= 9 || score == 100) grade = "A";
		
		else if(tenDigit >= 8) grade = "B";
		else if(tenDigit < 8 || score < 80)grade = "C";
	
		
		if(0 <= oneDigit && score < 80) grade = "C";
		else if(oneDigit >= 8 || score == 100) grade += "+";
		else if(0 <= oneDigit && oneDigit < 4) grade += "-";
	
		
		System.out.print(grade);
		*/
		/*
		int score = 0;
		
		String grade = "";
		String grade2 = "";
		System.out.print("점수: ");
			score = sc.nextInt();
		
		if(score >= 98) grade = "A+";
		else if(score >= 94) grade = "A";
		else if(score >= 90) grade = "A-";
		else if(score >= 88) grade = "B+";
		else if(score >= 84) grade = "B";
		else if(score >= 80) grade = "B-";
		else grade = "C";
		
		System.out.printf("%s",grade); */
		
		
		/* if (grade.equals("A+")) grade = "A";
		System.out.println("\n" + grade); */
		
		
		/* grade2 = "92";
		
		if(90 <= score || score <= 98) grade2 = "A";
		else if(80 <= score || score < 90) grade2 = "B";
		else grade2 = "C";
		
		System.out.printf("%s", grade2); */		
	}
}
