package ch06.ex02.case01;

public class C extends A {
	public void test() {
		int x = 0;
		
		// x = this.a; - Error] private�� �ڽ��̶� �� �ǵ帲.
		x = this.b; // A�� b�� �°� , C�� b�� ����.
		x = this.c;
		x = this.d;
		
		// this.m1(); - Error] private�� �ڽ��̶� �� �ŵ帲.
		this.m2();
		this.m3();
		this.m4();
	}
}
