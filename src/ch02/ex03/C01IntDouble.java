package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		 // promotion 작은 값 -> 큰 값
		d = i;
		
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i;
		System.out.printf("%f, %d\n", d, i);
		
		// i = d;	error
		i = (int)d;
		System.out.printf("%f, %d\n", d, i);
	}
}