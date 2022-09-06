package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		//int = integer 정수 //  decimal = 정수, 10진수
		
		int x = 10; 	// decimal - 10진수로 나타냄
		System.out.println(Integer.toBinaryString(x)); // 입력받은 parameter를 2진수로 string으로 나타냄
		
		x = 0b1010; 	// binary - 2진수로 나타냄 -- 0b
		System.out.println(Integer.toBinaryString(x));
		
		x = 012;  		// octal - 8진수로 나타냄  -- 0
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA;  		// hexa - 16진수로 나타냄  -- 0x
		System.out.println(Integer.toBinaryString(x)); 
		
		
		x = 1_234_567; 	// 가독성을 위해, 천 단위는 변수와 리터럴에 ' _ ' UnderBar 사용가능
		System.out.println(x + 1);  	// 숫자라서 더하기 가능함
		
		double y = 1e1; // 10의 1제곱
		System.out.println(y);
	}
}
