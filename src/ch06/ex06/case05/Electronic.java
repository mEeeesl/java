package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATA = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
	
}
/*	interface는 캡슐화 private 안하고 public 해버림
 	interface는 public static final + abstract가 필수임
 	interface는 생성자가 있을수 없기에, 변수선언문에서 초기값을 작성 해야댐
 	내가 public이던 static이던 안써도, public static final 상태임
 	abstract 안써도 abstract 상태임
 	
 	예를들어 가위바위보 게임할때 가위바위보는 인터페이스에 둬야댐
 	final로 조져야댐
 */
