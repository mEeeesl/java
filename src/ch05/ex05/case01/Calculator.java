package ch05.ex05.case01;

public class Calculator {
	//method���� ����
	//		�� return     �� parameter
	public int add(int a, int b) { // transparent
		return a + b;
	}
	
	// overloading = 1���� Ŭ������ �̸��� ���� parameter�� �ٸ� method��
	//				 2�� �̻� ������.
	// 				 add��� �̸��� ������ �ٸ� method��
	// ex) println(int);, println(double);, println("String"); 
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
