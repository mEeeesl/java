package ch04.ex04;

import java.util.Scanner;

public class C02InLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int len = 0;
		
		// 1���ڸ� �Է��ؾ���
		
		do {
			System.out.println("�ѱ��ڸ� �Է��ϼ���. :");
			input = sc.nextLine();
			len = input.length();
			System.out.println(len + "���� �Է��߽��ϴ�.");
		} while(len != 1);
	}
}
