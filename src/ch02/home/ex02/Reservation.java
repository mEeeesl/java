package ch02.home.ex02;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
/*   ����]
�����϶�. ȯ���� �����Ϸκ��� 3�� ������ �����ϴ�.

���� ���ڸ� �Է��ϼ���.
��: (Ŀ�� �����̸鼭 �Է´�� ���ϴ� �� �Է��ϸ�� )
��: (�� ġ�� ���ʹ����� �� ���� �Ȱ���)
��: (�Ȱ���)

2025-07-17 ������ �����߽��ϴ�.
2025-07-14 ���� ȯ���� �����մϴ�. ^^*
*/

		
		/* System.out.print("���� ���ڸ� �Է��ϼ���.\n��: ");
		int year = sc.nextInt();
		

		System.out.print("��: ");
		int month = sc.nextInt();
		
		
		System.out.print("��: ");
		int day = sc.nextInt();
		
		System.out.printf("%d-%d-%d ������ �����߽��ϴ�.\n",year ,month, day );
		System.out.println("2025-07-14 ���� ȯ���� �����մϴ�. ^^*");
		*/
		
	
	/* 
	 System.out.print("���� ���ڸ� �Է��ϼ���.\n��: ");
	 
	int year = sc.nextInt();
	
	System.out.print("��: ");
	int month = sc.nextInt();
	
	System.out.print("��: ");
	int day = sc.nextInt();
	
	LocalDate date = LocalDate.of(year, month, day);
	System.out.printf("%d-%d-%d ������ �����߽��ϴ�.\n",year ,month, day);
	System.out.println("2025-07-14 ���� ȯ���� �����մϴ�. ^^*");
	*/
	
	/* �켱, ���� ����ϰ��� �� ������ ������� �ϰ�, �ʱ�ȭ �ص� ���¿��� ���� �ؾ� ���� �� ���� */
		
	Scanner sc = new Scanner(System.in);
	int year = 0;
	int month = 0;
	int day = 0;
	
	System.out.println("���� ���ڸ� �Է��ϼ���.");
	System.out.print("��: "); year = sc.nextInt();
	System.out.print("��: "); month = sc.nextInt();
	System.out.print("��: "); day = sc.nextInt();
	
	LocalDate showDate = LocalDate.of(year, month, day);
	
	System.out.println();
	System.out.println(showDate + " ������ �����߽��ϴ�.");
	System.out.println(showDate.minusDays(3) + " ���� ȯ���� �����մϴ�.");
		
	}
}
