package ch07.ex01.case02;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		// promotion
		B b = c;	
		A a = c;
		Object o = c;
		
		// Casting
		c = (C)o;
		c = (C)a;
		c = (C)b;
		
		//b = a; Error
		b = (B)a;
		a = a;
	}
}
/*	대장		A
 *  부대장	B
 *  부하		C
 *  Object 타입은 자동상속
 *   
 *   
 */