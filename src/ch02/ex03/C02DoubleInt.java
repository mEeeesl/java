package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.52;
		int i = (int)d;
		System.out.printf("%d, %f\n", i, d);
		
		double f = Math.floor(d);	//  �ݳ���
		double r = Math.round(d);	//	�ݿø�
		System.out.printf("%f, %f\n ", f, r);
	}
}