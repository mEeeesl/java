package ch02.home.ex01;

public class H01Replacement {
	public static void main(String[] args) {

		// ����] �� ������ �����͸� ��ü�϶�.
		// a���� b������ ������ �ְ� �� ���� ��ü �� ��, �Է� ��� �ʿ���� �˰��� 
		
		int a = 1;
		int b = 2;
		System.out.printf("%d %d", a, b);
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.printf("\n%d %d", a, b);
	}
}


 

