package ch07.ex01.case09;

public class Shooter {
	
	//	dependancy type은 확장성을위해 interface로 둔다.
	private Gun gun;
	
	public void fire() {
		this.gun.fire();
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
/*	앞으로, interface를 무조건 구상하고 시작해야한다.
 */
