package ch04.home.ex02;

import java.util.Scanner;

public class H01Coupon {
	public static void main(String[] args) {
		 
		int grade = 0;
		String grade2 ="";
		String coupon = "";
		Scanner sc = new Scanner(System.in); 
		
		do {
			System.out.print("���: "); grade = sc.nextInt();
			if(grade == 3) coupon = "10,000�� ";
			else if(grade == 2) coupon = "5,000�� ";
			else if(grade == 1) coupon = "1,000�� ";
			else coupon = "�ٽ� �Է��ϼ���.";
		} while(!(1 <= grade && grade <= 3));
		System.out.println(coupon);			
				
		/*	2.
		 System.out.print("���: "); grade2 = sc.nextLine(); 
		 
		if(grade2.equals("gold")) coupon = "10,000�� ";
		else if(grade2.equals("silver")) coupon = "5,000�� ";
		else if(grade2.equals("cupper")) coupon = "1,000�� ";
		else coupon = "�ٽ� �Է��ϼ���.";
		
		System.out.println(coupon);			*/
		
		
		
	}
}
/*
����] ch04.ex02.C02Switch�� if�� reFacktoring �϶�

int grade = 1;
		String coupon = "";
		
		switch(grade) {
		case 3: coupon += "10,000�� "; break;
		case 2: coupon += "5,000�� "; break;
		case 1: coupon += "1,000�� "; 
		
*/