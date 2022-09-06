package ch02.ex02;

public class C02Char {
	public static void main(String[] args) {
		char c = 'A';
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 65;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041;
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0041';
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		
		
		// A = 10진수 65 = unicode 0041 = \u0041
		// char unicode가 16진수기에 16진수를 나타내는 hexa - 0x 를 앞에 붙여야한다.
		// 'A' = 65 = 0x0041 = '\u0041'
	}
}
