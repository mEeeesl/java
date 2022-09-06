package ch08.ex02.case005;

public enum Level {
	GOLD(3, null), SILVER(2, GOLD), COPPER(1, SILVER);
	
	private final int value;
	private final Level next;
	
	private Level(int value, Level next) {
		this.value = value;
		this.next = next;
	}
	
	public int value() {
		return this.value;
	}
	public Level next() {
		return this.next();
	}
}
