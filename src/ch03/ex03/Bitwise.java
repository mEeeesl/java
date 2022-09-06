package ch03.ex03;
						// 비트전환연산자 ' ~ ' ( 딱히 쓸일이 거의 없다함 )
public class Bitwise {
	public static void main(String[] args) {
		int x = 10;		// 10 = 1010 (2진수)
		System.out.printf("%s, %d\n", "0000000000000000000000000000" + Integer.toBinaryString(x), x);
		
		x = ~x;     	// -11
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x);
		
		x = x + 1;		// -10
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x);
	}
}