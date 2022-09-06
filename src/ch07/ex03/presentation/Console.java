package ch07.ex03.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static String inStr(String msg) {
		System.out.println(msg + "\n> ");
		return sc.nextLine().trim();
	}
}
/* 인터페이스는 public static final 이거 기본셋팅인거 알지?
 * obj은 더 많이 쓰려고 확장성 높이려고 
 */
