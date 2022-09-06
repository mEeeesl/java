package ch07.ex04.case05.presentation;
//예외처리
import java.util.Scanner;

public class Console {
	private static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}
	//static블록은 바이트코드가 로딩된 직후에 실행된다.
	//바이트코드가 로딩된 직후에 뭔가 일을 하고싶을때 사용
	//바이트로딩은 1번만하기떄문에 딱1번만 처음에 나온다.
	
	//콘솔클래스 외부에서 콜하지 않겠다. 내부에서만 콜하겠다 할때 private를 쓴다.
	private  static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	} //안보이니까 못바꿈.
	
	public static String inStr(String msg) {
		Console.inMsg(msg); //호출
		return sc.nextLine().trim(); //이런 코딩기법을 chaining
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	//알림메세지를 알려주는 메소드
	public static void info(String msg) {
		System.out.println(msg);
	}
	//에러메세지 출력
	public static void err(String msg) {
		System.out.println("ERROR]" + msg);
	} //err해줘서 메시지 뜨게하는걸 wrapping
}
//trim()의 기능: 입력값(문자)에서 여백을 지워버린다.
//Console은 utility클래스다. inMsg는 utility메소드다.