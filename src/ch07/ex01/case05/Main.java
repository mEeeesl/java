package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		Car car = new FireEngine();		//promotion
		car.run();
		//car.water(); - Error
		
		//FireEngine fireEngine = (FireEngine)new Car(); �̰͵� ����
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.run();
		fireEngine.water();
		
		((Car)fireEngine).run(); 
		// 1ȸ������ ���� CarŸ������ ��ȯ�� fireEngine�� run����
	}
}
/*	polymorphism = ������ 	
 * 	��ü�� 2�� �̻��� Ÿ���� �����ִ� ���̴�.
 * 	�θ� Ŭ�������� ����� ���� ����鸸 ���� �� �� �ְ�,
 * 	�ڽ� Ŭ�������� ������� ����鿡�Դ� ���� �� �� ����.
 * 		
 */
