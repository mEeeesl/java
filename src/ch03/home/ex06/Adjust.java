package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		/* ����]
		 * % �����ڸ� �̿��ؼ�, �Ǽ����� �Ҽ��� ���ϸ� ����ó���϶�.
		 * (casting), Math API�� ��� �� �Ѵ�.
		 * �Ǽ����� sc.nextDouble(); �� �Է��Ѵ�.
		 * 
		 * x: 3.1492
		 * 3.0
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double a = 0;
		
		System.out.print("x: "); a = sc.nextDouble();
		
		System.out.println(a - (a % 1));
		
		/* double b = 0;
		 * b = a - (a % 1);
		 * System.out.println(b);
		 */
	}
}