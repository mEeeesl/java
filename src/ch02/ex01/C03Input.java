package ch02.ex01;

import java.util.Scanner;//스트링 클래스는 lang파일에 있는 기본파일이지만, 스캐너는 아니라서 직접 해줘야함.?

public class C03Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("문자열을 입력하세요.\n>");
		String str = sc.nextLine();
		//과제] <입력데이터>를 입력했습니다.
		System.out.printf("<%s>를(을) 입력했습니다.", str);
		
		
		System.out.print("숫자를 입력하세요.\n>");
		int I = sc.nextInt();
		System.out.println(I + "를 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n>");
		String II = sc.nextLine(); 
		System.out.println(II + "를 입력했습니다.");
		
		System.out.print("문자열을 입력하세요.\n>");
		String str = sc.nextLine();
		System.out.printf("<%s>를 입력했습니다.", str);
		*/
		System.out.print("문자를 입력하세요.\n>");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
	}

}
