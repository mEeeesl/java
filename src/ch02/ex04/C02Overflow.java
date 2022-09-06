package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		// byte b = 128; ( Error / byte =  -128 <= byte <= 127 )
		byte b = 127;
		
		// b = b + 1;    ( Error )
		
		b++;
		//b++;
		
		System.out.print(b);
	}
}
