package ch07.ex07.case05;

public class Main {
	public static void main(String[] args) {
		Janitor<Building> janitor1 = a -> System.out.println(a + ", 청소합니다.");
		Janitor<Car> janitor2 = b -> System.out.println(b + ", 청소합니다.");
		
		janitor1.clean(new Building());
		janitor2.clean(new Car());
		
		//janitor1.clean(new Car()); Error - 이미 생성할때 1-<Building>으로 해놈
		
	}
}

// 파라미터 1개면 () 생략가능
// 람다 적극적으로 사용하래 .. 