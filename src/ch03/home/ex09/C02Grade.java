package ch03.home.ex09;

import java.util.Scanner;

public class C02Grade {
	public static void main (String[] args) {
		
		/* ����]
		 * ����, ����, ���� ������ �Է¹޴´�.
		 * ����, ���, ������ ����Ѵ�.
		 * ��������� �Ҽ������� 1�ڸ������� ����Ѵ�.
		 * 
		 * ���) 90 <= mean <= 100: A
		 * 	 	80 <= mean < 90:   B
		 * 			  mean < 80:   C
		 * 
		 * ����: 95
		 * ����: 100
		 * ����: 100
		 * 
		 * ����: 295
		 * ���: 98.3
		 * ����: A
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int kor = 0; // ��������
		int eng = 0; // ��������
		int math = 0; // ��������
		int tot = 0; // ����
		double avg = 0; // ���
		char grade = 0; // ����
		
		System.out.print("����: ");
		kor = sc.nextInt();
		System.out.print("����: ");
		eng = sc.nextInt();
		System.out.print("����: ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0; // ��
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C';
		
		System.out.printf("\n����: %d\n���: %.1f\n����: %c",tot, avg, grade);
		
		if(avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else grade = 'C';
		
		System.out.printf("\n����: %d\n���: %.1f\n����: %c",tot, avg, grade);
		
		/* int kor = 0;	// ���� ����
		int eng = 0;	// ���� ����
		int math = 0;	// ���� ����
		int sum = 0;	// ����
		double mean = 0.0;	// ���
		
		System.out.print("����: "); kor = sc.nextInt();
		System.out.print("����: "); eng = sc.nextInt();
		System.out.print("����: "); math = sc.nextInt();

		System.out.println();
		
		sum = kor + eng + math;
		mean = (double)kor + eng + math;
		
		char grade = sum/3 >= 90 ? 'A' : sum/3 >= 80 ? 'B' : 'C';
				
		System.out.printf("����: %d\n", sum);
		System.out.printf("���: %.1f\n", mean/3);
		System.out.printf("����: %c", grade); */
	}
}
