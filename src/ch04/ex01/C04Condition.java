package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("good");
		
		char b = 'b';
		// a < b < c - good 출력
		
		if('a' < b && b < 'c') 
			System.out.println("good");
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0)
			System.out.printf("x: %d, y: %d\n", x, y);	//x=3 , y=0
		
		// s값이 he, hE, He, HE 중 하나면, he 출력하기
		/*
		 String s = "";
		
		s = "hE";
		if((s == "he" || s == "hE") || (s == "He" || s == "HE"))
			System.out.println("he");
		*/
		
		String s = "hE";
		if (s.equals("he") || s.equals("hE") || s.equals("He") || s.equals("HE"))
		System.out.println("he");

		// 과제 ] 값이 있으면, 값이 있다를 말하라.
		
		s = "";
		if (s.equals("")) System.out.println("값이 없다.");
		else System.out.println("값이 있다.1");
		
		s = "2";
		if ( s != "" ) System.out.println("값이 있다.2");
		
		s = "3";
		if (!s.equals("")) System.out.println("값이 있다.3");
		
		
		// toggle 변수 사용할때 유용함
		boolean power = false;
		if(!power) System.out.println("전원을 켜다.");
		
	}
}
