package ch06.ex06.case03;

public class Fridge implements Appliance {
	@Override
	public void on() {
		System.out.println("냉장고를 켜다.");
	}
	
	@Override
	public void off() {
		System.out.println("냉장고를 끄다.");
	}
}
/*	extends 는 domain?에 첨부터 public void on() {} 이거까지 정의하지만,
	implements 하면 domain?에 void on()만 쓰는대신,
	@Override로 Body {}를 강제로 만들어야함
	확장성을 확보하고자 쓰는거임.
	이거 자주쓴다함 interface - implements 
*/