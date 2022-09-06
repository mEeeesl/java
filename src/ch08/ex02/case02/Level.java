package ch08.ex02.case02;

public enum Level {	//�н��ϴ±迡 �ϴ°ŷ�, �ʹ� ��Ʈ���� ��������
	GOLD(3, null), SILVER(2, GOLD), COPPER(1, SILVER);
	
	private final int value;
	private final Level next;
	
	// enum �� �����ڰ� public�� �ƴ� private��. 
	// �ܺο��� new() ������ ȣ���� ����
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
