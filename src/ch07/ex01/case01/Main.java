package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		//promotion
		B b = c;
		A a = c;
		
		//Casting
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
		a = (A)b;
		//String s = (String)c; - Error - C���� String Ÿ���� ����
	}
}

/*			double d = int i;
 *			int i  = (int)double d;
 *	
 *  ����  A, B
 *  �̵���  C 
 *  
 *  ���� Ÿ���� ū Ÿ������ ���� - promotion ��
 *  
 *  new() ��ü �ϳ��� ���� Ÿ������ ��ƺ�����
 *  
 *  �ش� ��ü�� �����ִ� Ÿ�Գ����� casting�� ������
 *  ���� �Ƶ�Ÿ���̰� �л�Ÿ���̰� ����Ÿ���� 
 *	 
 */