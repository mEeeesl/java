package ch05.ex05.case01;

public class Calculator {
	//method명은 동사
	//		▼ return     ▼ parameter
	public int add(int a, int b) { // transparent
		return a + b;
	}
	
	// overloading = 1개의 클래스에 이름이 갖고 parameter가 다른 method를
	//				 2개 이상 선언함.
	// 				 add라는 이름은 같지만 다른 method임
	// ex) println(int);, println(double);, println("String"); 
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
