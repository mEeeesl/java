package ch05.ex02.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Board board = new Board();
		
		board.setMsg("�ູ�� �Ϸ縦 �����մϴ�.");
		board.setWrittenDate(LocalDate.now());

		board.setMsg("���˵���2 ��������.");
		board.setWrittenDate(LocalDate.of(2022, 6, 30));
		
		System.out.printf("%s\n%s ���ῡ", board.getMsg(), board.getWrittenDate());
	}
}
