package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		
		 /* ����] a, b ������ ���� ��ü�϶�.
				a�� b���� ���Ƿ� �Է� �޴´�.
				��ü ����� ����Ѵ�. 		*/
		
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
		System.out.println("- a, b ���� ��ü�մϴ�.");
		
		// business logic
		int temp = 0;
		temp = a;	//	backup
		a = b;
		b = temp; 
		
		System.out.printf("=> a': %d, b': %d\n", a, b);		
		
	}
}