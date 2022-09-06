package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0;
		System.out.println(shortPi);  // 3.1 - 31(int) / 10.0(double) = 3.1(double)
		
		
		// 소수점 몇 자리까지 사용할 것인지 필요할 때, 사용 한다고함
		shortPi = (int)(pi * 1000) / 1000.0;
		System.out.println(shortPi);  // 3.141
		
		shortPi = (int)(pi * 10000) / 10000.0;
		System.out.println(shortPi);  
		
		// 과제 ] 3.142
		shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi); // 3.142   
		
	}
}
