package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A a = new A(); // import(cnt+shift+o)하면 A 클래스 경로 탐색해서 인식함
		
		int x = 0;
		/* x = a.a; - Error - private
		   x = a.b; - Error - 'default'는 같은 패키지내 공유가능
		   x = a.c; - Error - 'protected'는 같은 패키지내 공유가능
		   					   but) 다른 패키지와는 공유 불가능    */
		   x = a.d; // public 다 가능
		   
		   // a.m1(); Error - private 
		   // a.m2(); Error - default - 다른 패키지내 공유불가
		   // a.m3(); Eroor - protected - 다른 패키지내 공유불가
		   a.m4(); // public 다 가능
	}
}
