package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0;
		System.out.println(shortPi);  // 3.1 - 31(int) / 10.0(double) = 3.1(double)
		
		
		// �Ҽ��� �� �ڸ����� ����� ������ �ʿ��� ��, ��� �Ѵٰ���
		shortPi = (int)(pi * 1000) / 1000.0;
		System.out.println(shortPi);  // 3.141
		
		shortPi = (int)(pi * 10000) / 10000.0;
		System.out.println(shortPi);  
		
		// ���� ] 3.142
		shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi); // 3.142   
		
	}
}
