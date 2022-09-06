package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		
		 /* 과제] a, b 변수의 값을 교체하라.
				a와 b값을 임의로 입력 받는다.
				교체 결과를 출력한다. 		*/
		
		/*
		double a = Math.random();
		double b = Math.random();
		System.out.printf("%.2f %.2f\n", a, b);
		
		double c = a;
		c = a;
		a = b;
		b = c;
		
		System.out.printf("%.2f %.2f", a, b);
		*/
		

		/* Scanner scan = new Scanner(System.in);
		
		System.out.print("A: ");
		int a = scan.nextInt();
		System.out.print("B: ");
		int b = scan.nextInt();
			
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b); */

		Scanner sc = new Scanner(System.in);
		
		// Presentation logic
		System.out.print("a: ");			
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a: %d, b: %d\n", a, b);
		System.out.println("- a, b 값을 교체합니다.");
		
		// business logic
		int temp = 0;
		temp = a;	//	backup
		a = b;
		b = temp; 
		
		System.out.printf("=> a': %d, b': %d\n", a, b);		
		
	}
}