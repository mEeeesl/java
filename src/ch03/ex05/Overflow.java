package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		long c = a + b;	
		System.out.println(c);	// 2000000
		
		c = a * b;
		System.out.println(c);	// -727379968 - error ( - overflow )
								// int가 담을 수 있는 크기가 오버됨
		
		c = (long)a * b;
		System.out.println(c);	// 10조 long type(8yte) 큰 크기로 형변환
		
		int x = a * b / a;		
		System.out.println(x);	//	-727 overflow
		
		int y = a * b / a;
		y = a * ( b / a );
		System.out.println(y);	//	1_000_000 연산순서를 생각하면 됨
	
		int z = a * b / a;
		z = a / b * a;
		System.out.println(z);	//	1_000_000 연산순서를 생각하면 됨
	}
}