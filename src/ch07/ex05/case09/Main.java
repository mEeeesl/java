package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";	// c��ü�� CŬ������ �ν��Ͻ���.
		if(c instanceof B) msg += "B ";	// c��ü�� B Class�� �ν��Ͻ���.
		if(c instanceof A) msg += "A ";	// c��ü�� A interface�� �ν��Ͻ���.
		if(c instanceof Object) msg += "Object ";
		System.out.println(msg);	//	C B A Object
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";	// false	
		if(b instanceof B) msg += "B ";	// true
		if(b instanceof A) msg += "A ";	// flase
		if(b instanceof Object) msg += "Object "; // true 
		System.out.println(msg);	//	B Object
		// C Class�� extends B�� �߰� �� �ڿ� implements A�� �ؼ�
		// ���� false����, �ڵ� ��ü�� ����
		
		// F class�� ���͵� ������ �ʾƼ� Error
		// if(b instanceof F);
		// if(c instanceof F);
		
		F f = new F();
		msg = "";
		//if(f instanceof C); - Error - class�� �����߸� ��밡��
		//if(f instanceof B); - Error 
		if(f instanceof A) msg += "A ";	// interface�� �����Ӱ� �� �� ����.
		if(f instanceof F) msg += "F ";
		if(f instanceof Object) msg += "Object";
		System.out.println(msg); // F Object ( A�� �� x )
		
	}
}
