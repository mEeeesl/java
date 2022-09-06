package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
		// x = a.a; - Error] private int a 라서 외부에서 사용불가
		x = a.b;
		x = a.c;
		x = a.d;
		
		// a.m1(); - Error] private void mi(){} 라서 외부에서 사용불가
		a.m2();
		a.m3();
		a.m4();
	}
}
