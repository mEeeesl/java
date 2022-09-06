package ch07.ex01.case09;

public class Pistol implements Gun{
	@Override
	public void fire() {
		System.out.println("탕탕");
	}
}
/*	앞으로, interface를 무조건 구상하고 시작해야한다.
 */