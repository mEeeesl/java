package ch02.ex02;

public class C04Str {
	public static void main(String[] args) {
		String src = "우리 개는 ";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		char c = 0;
		
		// 문자 길이를 파악하는 method
		
		int len = src.length();
		System.out.println("length: " + len); 
		System.out.printf("length: %d\n", len);
		
		// 답은 5 > Space도 문자임 (유니코드 0020) / 우 리   개 는
		
		s1 = src.concat("짖는다.");
		s2 = src.replace("개", "고양이");
		s3 = src.substring(0, 4);
		c = src.charAt(3);
		
		String s4 = src.substring(3, 4);
		
		System.out.printf("%s\n%s\n%s\n%c\n%s", s1, s2, s3, c, s4);
		
		// src는 여전히 "우리 개는 " 인 상태이다.
		// substring > 0우1리2enter3개4는5enter6
		
	}
}
