package ch07.ex01.case05;

public class Main {
	public static void main(String[] args) {
		Car car = new FireEngine();		//promotion
		car.run();
		//car.water(); - Error
		
		//FireEngine fireEngine = (FireEngine)new Car(); 이것도 가능
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.run();
		fireEngine.water();
		
		((Car)fireEngine).run(); 
		// 1회용으로 가능 Car타입으로 변환한 fireEngine이 run실행
	}
}
/*	polymorphism = 다형성 	
 * 	객체가 2개 이상의 타입을 갖고있는 것이다.
 * 	부모 클래스에서 상속을 받은 멤버들만 접근 할 수 있고,
 * 	자식 클래스에서 만들어진 멤버들에게는 접근 할 수 없다.
 * 		
 */
