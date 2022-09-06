package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		Phone phone = new Phone();
		
		person.setName("최한석");
		person.setPhone(phone);
		phone.setBrandName("삼성");
		phone.setPrice(1_000_000);
		
		person.sendMsg();
		person.call();
		person.playGame();
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
 * Class phone > 1. price 2. brand 3. 메세지기능/전화기능/게임기능
 * Class man > 1. name 2. phone으로 메시지/전화/게임하다
 */
