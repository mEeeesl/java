package ch06.ex06.case09;

public interface UI {
	static void in() {
		System.out.println("키보드로 입력하다.");
	}
	
	void out();
}
/*	static method
 *	인터페이스는 원래 바디가 없음
 *	바디 붙이려면 default or static 이용
 *	CLI
 *	
 */