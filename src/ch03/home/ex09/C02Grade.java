package ch03.home.ex09;

import java.util.Scanner;

public class C02Grade {
	public static void main (String[] args) {
		
		/* 과제]
		 * 국어, 영어, 수학 점수를 입력받는다.
		 * 총점, 평균, 학점을 출력한다.
		 * 평균점수는 소수점이하 1자리까지만 출력한다.
		 * 
		 * 평균) 90 <= mean <= 100: A
		 * 	 	80 <= mean < 90:   B
		 * 			  mean < 80:   C
		 * 
		 * 국어: 95
		 * 영어: 100
		 * 수학: 100
		 * 
		 * 총점: 295
		 * 평균: 98.3
		 * 학점: A
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int kor = 0; // 국어점수
		int eng = 0; // 영어점수
		int math = 0; // 수학점수
		int tot = 0; // 총점
		double avg = 0; // 평균
		char grade = 0; // 학점
		
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0; // ★
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C';
		
		System.out.printf("\n총점: %d\n평균: %.1f\n학점: %c",tot, avg, grade);
		
		if(avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else grade = 'C';
		
		System.out.printf("\n총점: %d\n평균: %.1f\n학점: %c",tot, avg, grade);
		
		/* int kor = 0;	// 국어 성적
		int eng = 0;	// 영어 성적
		int math = 0;	// 수학 성적
		int sum = 0;	// 총합
		double mean = 0.0;	// 평균
		
		System.out.print("국어: "); kor = sc.nextInt();
		System.out.print("영어: "); eng = sc.nextInt();
		System.out.print("수학: "); math = sc.nextInt();

		System.out.println();
		
		sum = kor + eng + math;
		mean = (double)kor + eng + math;
		
		char grade = sum/3 >= 90 ? 'A' : sum/3 >= 80 ? 'B' : 'C';
				
		System.out.printf("총점: %d\n", sum);
		System.out.printf("평균: %.1f\n", mean/3);
		System.out.printf("학점: %c", grade); */
	}
}
