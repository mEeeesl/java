package ch07.ex01.case10;

public class TeslaCar implements SelfCar {
	private SelfCar os;	//interface SelfCar 라서 google apple 다 사용가능
	
	@Override
	public void start() {
		os.start();
	}
	
	public void setOS(SelfCar selfCar) {
		this.os = selfCar;
	}
}
