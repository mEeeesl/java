package ch06.ex02.case01;

public class C extends A {
	public void test() {
		int x = 0;
		
		// x = this.a; - Error] private은 자식이라도 못 건드림.
		x = this.b; // A의 b도 맞고 , C의 b도 맞음.
		x = this.c;
		x = this.d;
		
		// this.m1(); - Error] private은 자식이라도 못 거드림.
		this.m2();
		this.m3();
		this.m4();
	}
}
