package ch05.ex05.case06;

public class Shooter {
	// ����] Shooter has a Gun �� ǥ���϶�
	// A has a B -> B = dependency (�������),�������
	private Gun gun; 

	// ���Ͱ� ���� ���.
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
