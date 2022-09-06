package ch08.ex02.case02;

public enum Level {	//학습하는김에 하는거래, 너무 스트레스 받지말래
	GOLD(3, null), SILVER(2, GOLD), COPPER(1, SILVER);
	
	private final int value;
	private final Level next;
	
	// enum 은 생성자가 public이 아닌 private다. 
	// 외부에서 new() 생성자 호출을 차단
	private Level(int value, Level next) {
		this.value = value;
		this.next = next;
	}
	
	public int intValue() {
		return this.value;
	}
	
	public static Level valueof(int value) {
		Level level = null;
		
		switch(value) {
		case 1: level = COPPER; break;
		case 2: level = SILVER; break;
		case 3: level = GOLD;
		}
		
		return level;
	}
	
	public Level next() {
		return this.next; 
	}
}
