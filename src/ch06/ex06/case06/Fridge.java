package ch06.ex06.case06;

public class Fridge implements HomeAppliance{
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; }
}
/*	최종적으론 주로 이렇게 모아서 하나만 나오게 씀
 * 
 */
