package ch07.ex01.case03;

public class Main {
	public static void main(String[] args) {
		D d = new D();
		// promotion
		C c = d;
		B b = d;
		A a = d;
		Object o = d;
				
		// Casting
		d = (D)o;
		d = (D)a;
		d = (D)b;
		d = (D)c;
	}
}
/*
 * 
 * */
