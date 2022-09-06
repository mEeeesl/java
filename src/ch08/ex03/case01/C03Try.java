package ch08.ex03.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("C:/DEV/a.txt"));
			
			for(int i: arr) out.println("arr[" + i + "]: " + arr[i]);
		} catch(ArrayIndexOutOfBoundsException eㅎㅎ) {
			out.println("배열 예외가 발생했습니다.");
		} catch(IOException eㅎㅎ) {
			System.out.println("IO 예외 발생했습니다.ㅎㅎ");
		} finally {
			if(out != null) out.close();	//out = 리소스객체 = close(); finally 에서 호출해서 없애줘야함
		}
		
		System.out.println("끝.");
	}
}
/* 	데이터를 파일에 저장안하고 DB에 저장하기때문에
	이런게 있다 ~ 라는 정도만
	
	// 현장에서는 Exception 만 쓴다함 블럭도 비워놓고
	
 	출력지가 객체래
 	try {} catch(){} 블럭 만들었지만 앱은 죽음
 	
 	일단 > out.println() 안에 arr[i-1] 로 해야 오류가 발생하지 않음
 	
 	근데 왜 오류가 발생했냐면 > catch 블럭 한 번 더 생성안해줘서
 	
 	해결방법 > catch(ArrayIndexOutOfBoundsException eㅎㅎ){} 추가
 	
 	배열 예외가 발생했습니다. out 객체에다가 준 상태.
 	
 	finally { } 안에 out.close(); 
 	-> C:/DEV/a.txt 텍스트 파일 들어가보면 
 	앱이 성공했든 실패했든거기에 값 주고 종료
 */
