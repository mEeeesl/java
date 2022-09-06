package ch06.ex06.case04;

import ch06.ex06.case03.Appliance;

public abstract class Fridge implements Appliance {
	void play() {}
}
/* 	일반 메소드는 호출하면 일을하지만, 얘는 일하지 않아서 추상메소드고
 	인터페이스 메소드는 추상메소드라서 오버라이드를 해야되는데 안해서 
 	implements만 진행시킨 시점에는 컴파일 에러임.
	@Oberride 하면 해결됨
	또는 추상메소드 자체를 abstract 해버리면 컴파일 에러 해결됨.;;
	
	implements - 부모 멤버 내꺼 + 메소드 바디 구현까지 직접 해야댐 
	
*/