package ch06.ex05.case01;

public class Product {
	private int price;

	public Product(int price) {
		this.price = price * 2;
	}
	
	public int getPrice() {
		return this.price;
	}
}
//this. - 데이터 타입이 다름 = 클래스가 다름
//이쪽껀 Product에서 만들어진 this.price
//저쪽껀 Shoes에서 만들어진 this.price
// 이런식으로 안만들면됨 