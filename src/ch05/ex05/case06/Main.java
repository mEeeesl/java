package ch05.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Shooter shooter = new Shooter();
		Gun gun = new Gun();
		
		// shooter has a gun. ���ʹ� ���� �� �ڷ� �����ִ�.
		shooter.setGun(gun);
		// ���ʹ� ���� ����.
		// Shooter Ŭ�������� ������ 
		// public void fire{Gun.fire()} �� �����
		shooter.fire();  
	}
}
