package ch03.home.ex04;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		/* ����] ���� �����
		�� �ڿ����� �Է� �޾�, �� �հ踦 ����϶� 
		a: 1
		b: 2
		1 + 2 = 3 */
		Scanner sc = new Scanner(System.in);

		int a = 0;		// ù��° �Է°�
		int b = 0;		// �ι�° �Է°�
		// int sum = 0;	//  ���� �����
		
		System.out.print("a: "); a = sc.nextInt();
		System.out.print("b: "); b = sc.nextInt();
		
		System.out.printf("%d + %d = %d", a, b, a + b);
		
		/* sum = a + b;
		
		System.out.printf("%d + %d = %d", a, b, sum); */
	}
}
