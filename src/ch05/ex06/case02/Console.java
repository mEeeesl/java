package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	//static 블록
	//바이트코드가 로딩된 직후 최초 1회만 실행됨
	//바이트코드가 로딩된 직후 하고싶은게 있으면 이렇게하래
	static { 
		sc = new Scanner(System.in);
	}
	
	//외부에서 못씀 private static // 클래스 내부에서만 사용하려함 아래처럼활용▼
	private static void inMsg(String msg){
		System.out.print(msg + "\n> ");
	}
	
	//외부에서 쓸수있
	public static String inStr(String msg) {
		Console.inMsg(msg);
		return sc.nextLine().trim();//trim() - 스페이스 공간 삭제해줌?/ chainning a.a.a
	}
	
	//숫자 입력 받는법
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	//알림메시지
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	//에러메시지
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}	//wrapping 한다고 한대
}
