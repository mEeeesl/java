package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��: ");
		month = sc.nextInt();
		
		if( 3 <= month && month <= 5) season = "��";
		else if (6 <= month && month <= 8) season = "����";
		else if (9 <= month && month <= 11) season = "����";
		else if (month == 12 || month == 1 || month ==2) season = "�ܿ�";
		else season = "�������� �ʴ� ��";
		
		System.out.printf("%d���� %s�Դϴ�. ", month, season);
		
		/*Scanner sc = new Scanner(System.in);
		String season = "";
		String exc = "";
		int month = 0;
		
		System.out.print("��: "); month = sc.nextInt();
		
		if ( 0 < month && month < 13) {
			if ( 3 <= month && month < 6 ) season = "��";
			else if ( 6 <= month && month < 9) season = "����";
			else if ( 9 <= month && month < 12) season = "����";
			else if ( 12 == month || month < 3 ) season = "�ܿ�";
			System.out.printf("%d���� %s�Դϴ�.", month, season);
			} 	
		else exc = "�ٽ� �Է����ּ���.";
		System.out.println(exc);  */
		/* if (0 >= month && month > 12) 
			System.out.println(exc);	*/
	}
}
/*
ch04.ex02.C04Season�� refactoring �Ѵ�.
switch�� if�� �ٲ۴�.
�������� ���� ���� �Է��� ����, ����ó���Ѵ�.
*/
