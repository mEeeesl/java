package ch05.ex07.case01;

public class Stack {
	public static void first() {
		int a = 1;	//first�� �ִ� a ������ Stack�� ���δ�.
		Stack.second(); //second�� static method��
						//Class.method , Class.������ ���� ȣ��
		
	}
	
	public static void second() {
		int a = 2;	
	}
}
