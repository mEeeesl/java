package ch05.ex07.case02;

public class Stack {
	public static void first() {
		System.out.println("Stack.first() ����.");
		int a = 1;	//first�� �ִ� a ������ Stack�� ���δ�.
		Stack.second(); //second�� static method��
						//Class.method , Class.������ ���� ȣ��
		System.out.println("Stack.first() ��.");
	}
	
	public static void second() {
		System.out.println("Stack.second() ����.");
		int a = 2;
		System.out.println("Stack.second() ��.");
	}
}
