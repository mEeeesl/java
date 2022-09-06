package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	//static 블록
	//바이트코드가 로딩된 직후 실행됨
	//바이트코드가 로딩된 직후 하고싶은게 있으면 이렇게하래
	static { 
		sc = new Scanner(System.in);
	}
	
	//외부에서 못씀 private static
	private static void inMsg(String msg){
		System.out.print(msg + "\n> ");
	}
	
	//외부에서 쓸수있
	public static String inStr(String msg) {
		String inPut = null;
		boolean isRun = false;
		do {
			Console.inMsg(msg);
			inPut = sc.nextLine().trim();
			if(inPut.length() > 0) isRun = true;
			else Console.err("한글자 이상 입력하세요.");
		} while(!isRun);
		return inPut;//trim() - 공백을 없애준다./ chainning a.a.a
	}
	
	//숫자 입력 받는법
	public static int inNum(String msg) {
		int num = 0;
		String numStr = null;
		boolean isRun = false;
		do {
			Console.inMsg(msg);
			numStr = sc.nextLine().trim();
			if (numStr.length() == 1 && 
					'0' < numStr.charAt(0) && numStr.charAt(0) <= '9') {
				isRun = true;
				num = Integer.parseInt(numStr);
			}
			else Console.err("한자리 자연수를 입력하세요");
		} while (!isRun);		
		return num;
	}
	
	//알림메시지
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	//에러메시지
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
