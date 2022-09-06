package ch04.home.ex02;

import java.util.Scanner;

public class H01Coupon {
	public static void main(String[] args) {
		 
		int grade = 0;
		String grade2 ="";
		String coupon = "";
		Scanner sc = new Scanner(System.in); 
		
		do {
			System.out.print("등급: "); grade = sc.nextInt();
			if(grade == 3) coupon = "10,000원 ";
			else if(grade == 2) coupon = "5,000원 ";
			else if(grade == 1) coupon = "1,000원 ";
			else coupon = "다시 입력하세요.";
		} while(!(1 <= grade && grade <= 3));
		System.out.println(coupon);			
				
		/*	2.
		 System.out.print("등급: "); grade2 = sc.nextLine(); 
		 
		if(grade2.equals("gold")) coupon = "10,000원 ";
		else if(grade2.equals("silver")) coupon = "5,000원 ";
		else if(grade2.equals("cupper")) coupon = "1,000원 ";
		else coupon = "다시 입력하세요.";
		
		System.out.println(coupon);			*/
		
		
		
	}
}
/*
과제] ch04.ex02.C02Switch를 if로 reFacktoring 하라

int grade = 1;
		String coupon = "";
		
		switch(grade) {
		case 3: coupon += "10,000원 "; break;
		case 2: coupon += "5,000원 "; break;
		case 1: coupon += "1,000원 "; 
		
*/