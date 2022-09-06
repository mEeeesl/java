package ch08.ex03.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "hello";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("ID 길이가 초과되었습니다."); // try로 묶어야만 가능
		} catch (LengthException eㅎㅎ) {
			eㅎㅎ.printStackTrace();
		}
		
		throw new NumberException("숫자가 아닙니다."); // try로 안묶어도 가능
	}
}
//ID길이를 3글자로 제한
//결론 > NumverException을 써라