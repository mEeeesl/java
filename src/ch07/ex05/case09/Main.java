package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";	// c객체는 C클래스의 인스턴스다.
		if(c instanceof B) msg += "B ";	// c객체는 B Class의 인스턴스다.
		if(c instanceof A) msg += "A ";	// c객체는 A interface의 인스턴스다.
		if(c instanceof Object) msg += "Object ";
		System.out.println(msg);	//	C B A Object
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";	// false	
		if(b instanceof B) msg += "B ";	// true
		if(b instanceof A) msg += "A ";	// flase
		if(b instanceof Object) msg += "Object "; // true 
		System.out.println(msg);	//	B Object
		// C Class가 extends B도 했고 그 뒤에 implements A도 해서
		// 값은 false지만, 코딩 자체는 가능
		
		// F class는 어디와도 엮이지 않아서 Error
		// if(b instanceof F);
		// if(c instanceof F);
		
		F f = new F();
		msg = "";
		//if(f instanceof C); - Error - class는 엮여야만 사용가능
		//if(f instanceof B); - Error 
		if(f instanceof A) msg += "A ";	// interface는 자유롭게 쓸 수 있음.
		if(f instanceof F) msg += "F ";
		if(f instanceof Object) msg += "Object";
		System.out.println(msg); // F Object ( A는 값 x )
		
	}
}
