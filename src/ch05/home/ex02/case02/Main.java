package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paper paper = new Paper();
		
		System.out.print("�޼���: ");
		paper.setMsg(sc.nextLine());
		System.out.print("�ۼ��ڸ�: ");
		paper.setWriterName(sc.nextLine());
		
		System.out.printf("\n%s from %s.",paper.getMsg(), paper.getWriterName());
		/*
		Scanner sc = new Scanner(System.in);
		String message = "";
		String writerName = "";
		
		System.out.print("�޼���: ");
		message = sc.nextLine();
		System.out.print("�ۼ��ڸ�: ");
		writerName = sc.nextLine();
		
		Paper paper = new Paper();
		paper.setMsg(message);
		paper.setName(writerName);
		
		System.out.printf("\n%s from %s.",paper.getMsg(), paper.getName());
		*/
	}
}

/*
���� ] ���̿� �޼����� �ۼ��ڸ��� ����϶�.
�ۼ��ڿ� �ۼ��ڸ��� �����ؾ��Ѵ�.

�ۼ���	��ü	writer
�ۼ��ڸ� 	�Ӽ�	writerName

0.���� 1. msg, 2. WrittorName

�޼���: hello
�ۼ��ڸ�: terry

hello from terry.
*/