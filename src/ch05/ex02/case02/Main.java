package ch05.ex02.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Board board = new Board();
		
		board.setMsg("행복한 하루를 시작합니다.");
		board.setWrittenDate(LocalDate.now());

		board.setMsg("범죄도시2 보러가요.");
		board.setWrittenDate(LocalDate.of(2022, 6, 30));
		
		System.out.printf("%s\n%s 저녁에", board.getMsg(), board.getWrittenDate());
	}
}
