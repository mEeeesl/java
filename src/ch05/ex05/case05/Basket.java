package ch05.ex05.case05;

public class Basket {
	//Class도 data type이기에 멤버변수 타입도 Apple가능
	//담기는건 apple 객체.
	//이 Basket의 클래스는 apple이 담긴 Basket이 됨.
	//객체 안에 객체가 있는 상태 - Basket has an Apple 
	
	private Apple apple;

	public Apple getApple() {
		return apple;
	}
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}
