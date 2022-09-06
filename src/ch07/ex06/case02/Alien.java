package ch07.ex06.case02;

public class Alien extends Life {
	// @Override static method는 상속이 안되기 때문에, @Override 불가
	public static void eat() {
		System.out.println("Alien이 먹다.");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien이 소리치다.");
	}
}
/* 인스턴스 멤버변수를 상속하는거 Override는 상속을 받고나서 마음에 안들어서 
 * 자기 스타일로 바꾸려고 하는건데 static이라 상속 자체를 못받음
 */
