package ch02.home.ex02;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
/*   과제]
예매하라. 환불은 공연일로부터 3일 전까지 가능하다.

공연 일자를 입력하세요.
년: (커서 깜빡이면서 입력대기 원하는 값 입력하면됨 )
월: (년 치고 엔터누르면 얘 나옴 똑같음)
일: (똑같음)

2025-07-17 공연을 예매했습니다.
2025-07-14 까지 환불이 가능합니다. ^^*
*/

		
		/* System.out.print("공연 일자를 입력하세요.\n년: ");
		int year = sc.nextInt();
		

		System.out.print("월: ");
		int month = sc.nextInt();
		
		
		System.out.print("일: ");
		int day = sc.nextInt();
		
		System.out.printf("%d-%d-%d 공연을 예매했습니다.\n",year ,month, day );
		System.out.println("2025-07-14 까지 환불이 가능합니다. ^^*");
		*/
		
	
	/* 
	 System.out.print("공연 일자를 입력하세요.\n년: ");
	 
	int year = sc.nextInt();
	
	System.out.print("월: ");
	int month = sc.nextInt();
	
	System.out.print("일: ");
	int day = sc.nextInt();
	
	LocalDate date = LocalDate.of(year, month, day);
	System.out.printf("%d-%d-%d 공연을 예매했습니다.\n",year ,month, day);
	System.out.println("2025-07-14 까지 환불이 가능합니다. ^^*");
	*/
	
	/* 우선, 내가 사용하고자 할 변수를 선언먼저 하고, 초기화 해둔 상태에서 시작 해야 좋은 것 같음 */
		
	Scanner sc = new Scanner(System.in);
	int year = 0;
	int month = 0;
	int day = 0;
	
	System.out.println("공연 일자를 입력하세요.");
	System.out.print("년: "); year = sc.nextInt();
	System.out.print("월: "); month = sc.nextInt();
	System.out.print("일: "); day = sc.nextInt();
	
	LocalDate showDate = LocalDate.of(year, month, day);
	
	System.out.println();
	System.out.println(showDate + " 공연을 예매했습니다.");
	System.out.println(showDate.minusDays(3) + " 까지 환불이 가능합니다.");
		
	}
}
