package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0);
		int unicode = ch;
		
		System.out.printf("%c의 unicode는 %d 입니다.", ch, unicode);
		// char 타입이니까 문자 A가 아니고 printf의 기능일 뿐이라함
		
		// hint ] char -> int
		/*
		  char c = '0';
		 
		int i = 0;
		c = 65;
		i = 65;
		String inVal = ""; 
		
		System.out.print("문자: "); inVal = sc.nextLine(); 
		System.out.printf("%c의 unicode는 %d 입니다.", c, i);
		*/
		
	}
}

/*
 과제 ] 입력한 문자의 unicode 를 출력하라.
 --
 
 문자: A
 A의 unicode는 65 입니다.
 
  A = char
  65 = int
 
  */