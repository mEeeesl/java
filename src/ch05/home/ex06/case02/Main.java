package ch05.home.ex06.case02;

public class Main {
	public static void main(String[] args) {
		
		Console.inStr("문자를 입력하세요");
		Console.inNum("숫자를 입력하세요");
		
		//Console.err("전원이 끊깁니다.");
		Console.info("끝.");
	}
}
/* 과제]
 * Console 을 고도화하라. 
 * > 예외처리를 한다.
 * 
 * 참된 예외처리
 * > Console.inStr(): 한글자 이상 입력해야한다 ( 참 )
 * > Console.inNum(): 한자리 자연수를 입력해야한다 ( 참 )
 * inStr inNum 머시기를 바꾸면댄데
 * 
 * 문자를 입력하세요.
 * > hello(내가입력)
 * 숫자를 입력하세요.
 * > 12(내가입력)
 * ERROR] 한자리 자연수를 입력하세요.
 * 숫자를 입력하세요.
 * > 1(내가입력)
 * 끝.
 */
