package ch04.ex04;

import java.util.Scanner;

public class C01DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;

		// while = 0회 이상 실행한다.
		// do ~ while = 1회 이상 실행한다.
		// { } => ; X >> { }
		// ( ) => ; O >> ( );
		
		do {
			System.out.print("a: ");
			a = sc.nextInt();
			
			System.out.print("b: ");
			b = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n\n", a, b, a + b);
		} while (a + b != 0);
	}
}
