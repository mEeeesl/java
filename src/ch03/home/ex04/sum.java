package ch03.home.ex04;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		/* 과제] 계산기 만들기
		두 자연수를 입력 받아, 그 합계를 출력하라 
		a: 1
		b: 2
		1 + 2 = 3 */
		Scanner sc = new Scanner(System.in);

		int a = 0;		// 첫번째 입력값
		int b = 0;		// 두번째 입력갑
		// int sum = 0;	//  더한 결과값
		
		System.out.print("a: "); a = sc.nextInt();
		System.out.print("b: "); b = sc.nextInt();
		
		System.out.printf("%d + %d = %d", a, b, a + b);
		
		/* sum = a + b;
		
		System.out.printf("%d + %d = %d", a, b, sum); */
	}
}
