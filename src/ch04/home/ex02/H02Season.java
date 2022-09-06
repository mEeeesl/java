package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월: ");
		month = sc.nextInt();
		
		if( 3 <= month && month <= 5) season = "봄";
		else if (6 <= month && month <= 8) season = "여름";
		else if (9 <= month && month <= 11) season = "가을";
		else if (month == 12 || month == 1 || month ==2) season = "겨울";
		else season = "존재하지 않는 월";
		
		System.out.printf("%d월은 %s입니다. ", month, season);
		
		/*Scanner sc = new Scanner(System.in);
		String season = "";
		String exc = "";
		int month = 0;
		
		System.out.print("월: "); month = sc.nextInt();
		
		if ( 0 < month && month < 13) {
			if ( 3 <= month && month < 6 ) season = "봄";
			else if ( 6 <= month && month < 9) season = "여름";
			else if ( 9 <= month && month < 12) season = "가을";
			else if ( 12 == month || month < 3 ) season = "겨울";
			System.out.printf("%d월은 %s입니다.", month, season);
			} 	
		else exc = "다시 입력해주세요.";
		System.out.println(exc);  */
		/* if (0 >= month && month > 12) 
			System.out.println(exc);	*/
	}
}
/*
ch04.ex02.C04Season을 refactoring 한다.
switch를 if로 바꾼다.
존재하지 않은 월을 입력할 경우는, 예외처리한다.
*/
