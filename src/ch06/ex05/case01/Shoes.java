package ch06.ex05.case01;

public class Shoes extends Product {
	private int price;	//Product의 price도 있는상태
		
	public Shoes (int price) {
		super(price);
		this.price = price;
	}
}
//this. - 데이터 타입이 다름 = 클래스가 다름
//여기껀 Shoes에서 만들어진 this.price
//저쪽껀 Product에서 만들어진 this.price
//이런식으로 안만들면 됨