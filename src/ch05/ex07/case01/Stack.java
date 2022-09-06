package ch05.ex07.case01;

public class Stack {
	public static void first() {
		int a = 1;	//first에 있는 a 변수는 Stack에 쌓인다.
		Stack.second(); //second가 static method라서
						//Class.method , Class.변수명 으로 호출
		
	}
	
	public static void second() {
		int a = 2;	
	}
}
