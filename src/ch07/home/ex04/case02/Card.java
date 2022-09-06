package ch07.home.ex04.case02;

public class Card {
	private int num;
	
	public Card(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return this.num + " ";
	}
}
// int를 string으로 바꾸려면 empty String 더해주기