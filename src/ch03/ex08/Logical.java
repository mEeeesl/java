package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		
		b = true && true;		//true
		b = (2 > 1) && (2 >= 1);//true 
		b = 2 < 1 && 2 > 1;		//false
		
		b = true || false;		//true
		b = 2 < 1 || 2 > 1;		//true
		b = 2 < 1 || 2 < 1;		//false
		System.out.println(b);		
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;
		
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);	// x: 1 y: 0 d: false
		// ++x < 0 > ���⼭ �̹� false�� ���Ա⿡, ++y�� ����� ���ع����⿡ y=0 �̴�.
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0;	
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);	// x: 1 y: 1 d: false
		// &�� false�� ���Դ��� ����� �ϱ� ��
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);	// x: 1 y: 1 d: false
		// || => ���� F���� �ڿ� T or F ���� �ľ��� ���� ����� ���� => y = 1 
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);	// x: 1 y: 0 d: True
		// �տ� �̹� True����, y������ ��� ���� => y = 0
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);	// x: 1 y: 1 d: True
		// |, &�� True�� False�� �ϴ� ����� �� �ϰ� �Ѿ => y = 1 
	}
}
