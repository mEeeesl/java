package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("good");
		
		char b = 'b';
		// a < b < c - good ���
		
		if('a' < b && b < 'c') 
			System.out.println("good");
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0)
			System.out.printf("x: %d, y: %d\n", x, y);	//x=3 , y=0
		
		// s���� he, hE, He, HE �� �ϳ���, he ����ϱ�
		/*
		 String s = "";
		
		s = "hE";
		if((s == "he" || s == "hE") || (s == "He" || s == "HE"))
			System.out.println("he");
		*/
		
		String s = "hE";
		if (s.equals("he") || s.equals("hE") || s.equals("He") || s.equals("HE"))
		System.out.println("he");

		// ���� ] ���� ������, ���� �ִٸ� ���϶�.
		
		s = "";
		if (s.equals("")) System.out.println("���� ����.");
		else System.out.println("���� �ִ�.1");
		
		s = "2";
		if ( s != "" ) System.out.println("���� �ִ�.2");
		
		s = "3";
		if (!s.equals("")) System.out.println("���� �ִ�.3");
		
		
		// toggle ���� ����Ҷ� ������
		boolean power = false;
		if(!power) System.out.println("������ �Ѵ�.");
		
	}
}
