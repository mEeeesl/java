package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		//Apple apple = new Apple();
		
		retailer.sell(farmer.sell(1000));
	}
}
// 사과가 나오고 Famer한테가고 Retailer한테가고 '사과'객체가 고객한테감 
// 이렇게 객체가 왔다리 갔다리하는것을 DTO라고 한다.
// Apple은 domain임 나머지는 아님.
/*
농부가 사과수학 > Farmer.sell
파머가 사과한테 가격표붙임
유통업자가 받아서 마진남기려고 그가격 2배받고 팜
retailer.sell이 리턴되고 끝
*/
