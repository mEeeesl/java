package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b;		// i = (int)b; promotion
		System.out.println(i);
	
		int i2 = 300;
		byte b2 = (byte)i2;
		System.out.println(b2);		// 300 -> 44가 된, Overflow(버그의 원인이됨)
	}
}
