package ch05.ex05.case07;

public class Retailer {
	//public Apple sell(Apple apple, int price, int margin) 
	//       ▼  사과 팔면 리턴되는 데이터타입은 Apple이어야하니까
	public Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2);	//Margin 붙임
		return apple;
	}
}
