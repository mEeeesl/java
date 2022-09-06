package ch02.home.ex01;

public class H01Replacement {
	public static void main(String[] args) {

		// 과제] 두 변수의 데이터를 교체하라.
		// a변수 b변수에 데이터 넣고 두 개를 교체 할 것, 입력 출력 필요없고 알고리즘만 
		
		int a = 1;
		int b = 2;
		System.out.printf("%d %d", a, b);
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.printf("\n%d %d", a, b);
	}
}


 

