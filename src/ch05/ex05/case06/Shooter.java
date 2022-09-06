package ch05.ex05.case06;

public class Shooter {
	// 과제] Shooter has a Gun 을 표현하라
	// A has a B -> B = dependency (의존대상),멤버변수
	private Gun gun; 

	// 슈터가 총을 쏘다.
	public void fire() {
		gun.fire();
	}

	
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	public Gun getGun() {
		return gun;
	}
}
