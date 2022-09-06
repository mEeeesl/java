package ch06.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Shoes shoes = new Shoes(1_000);	// price변수는 2개 있음지금
										// 이런식으로 코딩은 앞으로 안할거래
										// 참고만
		System.out.println(shoes.getPrice());
	}
}
