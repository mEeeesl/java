package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		// sum�� �ִ� 6�� string ���ڷ� �ٲٱ�
		
		String sumStr = "" + sum;
		System.out.println(sumStr);
		
		int q = a + b;
		String w = "" + q;
		System.out.println(w); 
		
		String z = "" + (a + b);
		System.out.println(z);
		
		String s = a + b + "";
		System.out.println(s);
		
		s = "" + a + b;
		System.out.println(s);   // >> 12(����) 
		
		String dialog = "John said, \"hello\"";		// \" aa \"== " aa "
		System.out.println(dialog);
	}
}
