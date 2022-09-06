package ch06.ex04.case02;

public class Circle{
	private int x;	//x좌표?
	private int y;	//y좌표?
	private int r;	//반지름?
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", x, y, r);
	}
}	
// 원의 넓이처럼 변수들로 계산이 가능한건 멤버변수로 두지 않는다.