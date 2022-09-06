package ch05.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Shooter shooter = new Shooter();
		Gun gun = new Gun();
		
		// shooter has a gun. 슈터는 총을 한 자루 갖고있다.
		shooter.setGun(gun);
		// 슈터는 총을 쐈다.
		// Shooter 클래스에서 정의한 
		// public void fire{Gun.fire()} 가 실행됨
		shooter.fire();  
	}
}
