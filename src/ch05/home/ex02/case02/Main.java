package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paper paper = new Paper();
		
		System.out.print("메세지: ");
		paper.setMsg(sc.nextLine());
		System.out.print("작성자명: ");
		paper.setWriterName(sc.nextLine());
		
		System.out.printf("\n%s from %s.",paper.getMsg(), paper.getWriterName());
		/*
		Scanner sc = new Scanner(System.in);
		String message = "";
		String writerName = "";
		
		System.out.print("메세지: ");
		message = sc.nextLine();
		System.out.print("작성자명: ");
		writerName = sc.nextLine();
		
		Paper paper = new Paper();
		paper.setMsg(message);
		paper.setName(writerName);
		
		System.out.printf("\n%s from %s.",paper.getMsg(), paper.getName());
		*/
	}
}

/*
과제 ] 종이에 메세지와 작성자명을 기록하라.
작성자와 작성자명은 구분해야한다.

작성자	객체	writer
작성자명 	속성	writerName

0.종이 1. msg, 2. WrittorName

메세지: hello
작성자명: terry

hello from terry.
*/