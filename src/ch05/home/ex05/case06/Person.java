package ch05.home.ex05.case06;

public class Person {
	// Man has a phone
	private String name;
	private Phone phone;
	
	public void sendMsg() {
		phone.sendMsg();
	}
	public void call() {
		phone.call();
	}
	public void playGame() {
		phone.playGame();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
/*
 * 최한석은 삼성폰을 1백만원 주고 삼
 * 손에 든 폰을 보니 흐뭇
 * 
 * 메세지 보내봄
 * 답장이 없어, 전화를 걸어보니, 연결이 안됨
 * 잠시 뒤에 다시 연락해보려고함.
 * 그 동안 폰으로게임함.
 * 
 * 1. 삼성폰의 멤버변수는 백만원+삼성 + 메세지기능 + 전화기능 게임기능
 * 2. 최한석 > 최한석 클래스에서 폰 
 * 
 */