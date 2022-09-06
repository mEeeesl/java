package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3;	
		// 변동할 수 없는 마지막 값, 이름있는 상수를 만듬
		// max = 1;
		
		double area = 3.14 * 3 * 3;
		
		final double PI = 3.14;
		int r = 3;
		
		area = PI * r * r;
		
		System.out.println(area);
	}
}
