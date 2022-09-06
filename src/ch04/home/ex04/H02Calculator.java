package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char op = 0;
		int result = 0;
		char isRepeat = 0;	
		// Toggle ������ �տ� is�� �ٿ����°� ���� ( isTrue isFalse ) 
		// Toggle ������ boolean Ÿ�� 
		
		do {
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();
			System.out.print("op: ");
			op = sc.nextLine().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = (int)(a % b);
			}
			
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.print("����Ͻðڽ��ϱ� (y/n) ? ");
			isRepeat = sc.nextLine().charAt(0);
		} while(isRepeat != 'n');
		
		
		System.out.println("��.");
		/*
		int a = 0;
		int b = 0;
		int calcu = 0;
		String op = "";
		String answer = "";
		boolean TruFal = false;
		
		do {
			System.out.print("a: ");
			a = sc.nextInt();sc.nextLine();
			System.out.print("op: ");
			op = sc.nextLine();
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();
			
			switch (op) {
			case "+": calcu = a + b; break;
			case "-": calcu = a - b; break;
			case "*": calcu = a * b; break;
			case "/": calcu = (int)(a / b);
			}
			System.out.printf("%d %s %d = %d",a ,op, b, calcu);
			System.out.println("\n����Ͻðڽ��ϱ� (y/n) ?");
			
			answer = sc.nextLine();
			if (answer.equals("n")) TruFal = true;
			
		} while (TruFal != true);
			
		System.out.println("��");
		*/
	}
}
/*	����] ���� �����
 * 	�����ڴ� + - 
 * 	/ �� �� ��´�. - %�� ��������
 *	
 * a: 1
 * op: +
 * b: 2
 * ����Ͻðڽ��ϱ� (y/n)? y
 * a: 2
 * op: /
 * b: 2
 * 2 / 2 =1
 * ��� yn? y
 * a: 1
 * op: *
 * b: 3
 * 2 * 3 = 6
 * ��� y/n ? n
 * ��.
 */