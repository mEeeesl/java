package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
	
		// x = this.a; Error - private
		// x = this.b; error - default - �ٸ� ��Ű���� �ȵ�
		x = this.c;   // protected - �ٸ� ��Ű���� �־, �ڽ��̸� ������
		x = this.d; // public
		
		// this.m1(); - private
		// this.m2(); - default
		this.m3();   // protected 
		this.m4();   // public
	}
}
