package ch05.ex09.case02;

public class Phone {
	private static int cnt;
	private int serial;
	
	//인스턴스 블록 ( call당하든 말든 객체(instance)가 생성될때 실행 )
	{
		serial = ++cnt * 100;
	}
	
	public Phone() {}
	
	public Phone(int serial) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return this.serial;
	}
}
