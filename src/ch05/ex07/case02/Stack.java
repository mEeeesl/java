package ch05.ex07.case02;

public class Stack {
	public static void first() {
		System.out.println("Stack.first() 시작.");
		int a = 1;	//first에 있는 a 변수는 Stack에 쌓인다.
		Stack.second(); //second가 static method라서
						//Class.method , Class.변수명 으로 호출
		System.out.println("Stack.first() 끝.");
	}
	
	public static void second() {
		System.out.println("Stack.second() 시작.");
		int a = 2;
		System.out.println("Stack.second() 끝.");
	}
}
