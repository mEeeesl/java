package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		char ch = sc.nextLine().charAt(0);
		int unicode = ch;
		
		System.out.printf("%c�� unicode�� %d �Դϴ�.", ch, unicode);
		// char Ÿ���̴ϱ� ���� A�� �ƴϰ� printf�� ����� ���̶���
		
		// hint ] char -> int
		/*
		  char c = '0';
		 
		int i = 0;
		c = 65;
		i = 65;
		String inVal = ""; 
		
		System.out.print("����: "); inVal = sc.nextLine(); 
		System.out.printf("%c�� unicode�� %d �Դϴ�.", c, i);
		*/
		
	}
}

/*
 ���� ] �Է��� ������ unicode �� ����϶�.
 --
 
 ����: A
 A�� unicode�� 65 �Դϴ�.
 
  A = char
  65 = int
 
  */