package ch04.home.ex04;

import java.util.Scanner;
									// 1~9 자연수만 입력받기 if(input.length() == 1 && '0' < input.charAt(0) && input.charAt(0) <= '9') 
public class H010neNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isGood = false;
		//입력값의 유효성을 나타내는 데이터, 온전하면 T 아님 F
		String errMsg = "ERROR] 한자리 자연수를 입력하세요.";
		
		do {
			System.out.print("입력: ");
			input = sc.nextLine();
			if(input.length() == 1 && '0' < input.charAt(0) && input.charAt(0) <= '9') {
				isGood = true;
			} else System.out.println(errMsg);
			} while(!isGood);
		
		System.out.println("끝.");
		}
	}
// 한자리 자연수 입력받는다.
// 10 이상의 자연수 또는 문자가 입력되면 예외처리(= 재반복) 한다.