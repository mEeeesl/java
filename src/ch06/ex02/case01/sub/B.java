package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A a = new A(); // import(cnt+shift+o)�ϸ� A Ŭ���� ��� Ž���ؼ� �ν���
		
		int x = 0;
		/* x = a.a; - Error - private
		   x = a.b; - Error - 'default'�� ���� ��Ű���� ��������
		   x = a.c; - Error - 'protected'�� ���� ��Ű���� ��������
		   					   but) �ٸ� ��Ű���ʹ� ���� �Ұ���    */
		   x = a.d; // public �� ����
		   
		   // a.m1(); Error - private 
		   // a.m2(); Error - default - �ٸ� ��Ű���� �����Ұ�
		   // a.m3(); Eroor - protected - �ٸ� ��Ű���� �����Ұ�
		   a.m4(); // public �� ����
	}
}
