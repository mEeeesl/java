package ch07.ex04.case04;

public class Ball {
	private int num;
	
	public Ball(int num) {
		this.num = num;		// 생성자 초기화. DI?
	}
	
	public int getNum() {
		return this.num;
	}
}
