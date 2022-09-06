package ch06.ex06.case05;

import ch06.ex06.case03.Appliance;

public class Fridge implements Appliance, Electronic {
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; }
	
}

/*	implements 뒤에 인터페이스를 여러개 쓸 수 있다.
 * 	interface는 body가 없어서 여러개둬도, 유지보수 안해도되서 부담▼ 확장성▲
 *  자식이 interface인 경우엔, extends로 인터페이스를 여러개 받을 수 있음
 *  package ch06.ex06.case06 interface HomeAppliance 참고
 */
