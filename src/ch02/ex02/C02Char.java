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
		
		
		
		// A = 10���� 65 = unicode 0041 = \u0041
		// char unicode�� 16�����⿡ 16������ ��Ÿ���� hexa - 0x �� �տ� �ٿ����Ѵ�.
		// 'A' = 65 = 0x0041 = '\u0041'
	}
}
