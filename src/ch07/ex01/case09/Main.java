package ch07.ex01.case09;

public class Main {
	public static void main(String[] args) {
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		Shooter shooter = new Shooter();
		
		shooter.setGun(pistol);
		shooter.fire();
		
		shooter.setGun(rifle);
		shooter.fire();
	}
}
/*	앞으로, interface를 무조건 구상하고 시작해야한다.
 */