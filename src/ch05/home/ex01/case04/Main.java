package ch05.home.ex01.case04;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate regDate = null;
		
		User user = new User();
		System.out.print("�̸�: ");
		user.setName(sc.nextLine());
		System.out.print("����: ");
		user.setAge(sc.nextInt());
		user.setRegDate(LocalDate.now());
		
		System.out.printf("\n�̸�: %s\n����: %d\n������: %s",
				user.getName(), user.getAge(), user.getRegDate());
		
		/*
		LocalDate regDate = LocalDate.now();
		 
		
		Scanner sc = new Scanner(System.in);
		
		User user = new User(); 
		System.out.print("�̸�: ");		
		user.setName(sc.nextLine());
		System.out.print("����: ");		
		user.setAge(sc.nextInt());
		
		System.out.println();
		
		System.out.println("�̸�: " + user.getName());
		System.out.println("����: " + user.getAge());
		System.out.println("������: "+ user.getRegDate());
		*/

	}
}

/*
����] ����ڸ� �����϶�.
������� �̸�, ���̸� �������� �Է� �޴´�. - �̸� sc.nextLine(); ���� sc.nextInt();  
�������� ���� ��¥�� �ڵ����� �Է� �޴´�. - LocalDate.now();

�̸�: gambit (�����Է�)
����: 25 	(�����Է�)

�̸�: gambit
����: 25
������: 2022-06-21 LocalDate.now();
*/