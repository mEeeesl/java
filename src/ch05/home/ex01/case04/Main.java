package ch05.home.ex01.case04;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate regDate = null;
		
		User user = new User();
		System.out.print("이름: ");
		user.setName(sc.nextLine());
		System.out.print("나이: ");
		user.setAge(sc.nextInt());
		user.setRegDate(LocalDate.now());
		
		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s",
				user.getName(), user.getAge(), user.getRegDate());
		
		/*
		LocalDate regDate = LocalDate.now();
		 
		
		Scanner sc = new Scanner(System.in);
		
		User user = new User(); 
		System.out.print("이름: ");		
		user.setName(sc.nextLine());
		System.out.print("나이: ");		
		user.setAge(sc.nextInt());
		
		System.out.println();
		
		System.out.println("이름: " + user.getName());
		System.out.println("나이: " + user.getAge());
		System.out.println("가입일: "+ user.getRegDate());
		*/

	}
}

/*
과제] 사용자를 생성하라.
사용자의 이름, 나이를 수동으로 입력 받는다. - 이름 sc.nextLine(); 나이 sc.nextInt();  
가입일은 오늘 날짜를 자동으로 입력 받는다. - LocalDate.now();

이름: gambit (수동입력)
나이: 25 	(수동입력)

이름: gambit
나이: 25
가입일: 2022-06-21 LocalDate.now();
*/