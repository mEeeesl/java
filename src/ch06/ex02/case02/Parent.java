package ch06.ex02.case02;

public class Parent {
	private String regNum;
	private String name;
	private int money;
	
	private String getRegNum() {
		return regNum;
	}
	public String getName() {
		return name;
	}
		//protected - 같은 패키지내에서 공유 + 다른 패키지라도 자식이면 공유
	protected int getMoney() {
		return money;
	}
		//default - 같은 패키지내에서만 공유
	void addMoney(int money) {
		this.money += money;
	}
}
