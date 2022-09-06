package ch03.ex02;
								// Not = !
public class C02Not {
	public static void main(String[] args) {
		boolean power = false;
		power = !power;	// flag variable ( 데이터 타입이 boolean임. true or false )
		System.out.println(power);

		power = !power;
		System.out.println(power);
	}
}