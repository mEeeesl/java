package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
	
		// x = this.a; Error - private
		// x = this.b; error - default - 다른 패키지면 안돼
		x = this.c;   // protected - 다른 패키지에 있어도, 자식이면 보여줌
		x = this.d; // public
		
		// this.m1(); - private
		// this.m2(); - default
		this.m3();   // protected 
		this.m4();   // public
	}
}
