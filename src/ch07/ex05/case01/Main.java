package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>();
		
		basket.set(new Apple());
		System.out.println(basket.get());
		
		// basket.set(new Grape()); -Error basket은 Apple basket이라서 못드감
		
		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}
// <E>써있던 것들이 Basket 에서는 Apple로 바뀜
// Basket에 있던 private E도, get도 set도 Apple로 바뀜
// generic type은 디자인할때가 아닌, new 생성할 때 객체타입을 정하는거지
// 확장성 Up
