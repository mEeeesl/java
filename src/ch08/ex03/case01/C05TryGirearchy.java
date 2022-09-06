package ch08.ex03.case01;

public class C05TryGirearchy {
	public static void main(String[] args) {
		
		try {
			int i = 3 / 0;
		} catch(ArithmeticException eㅎㅎ) {
			System.err.println("ArithmeticExeption이 발생했습니다. ㅎㅎ");
		} catch(Exception eㅎㅎ) {
			System.err.println("Exception이 발생했습니다. ㅎㅎ ");
		}
	}	
}
/* 	exception 해도 자식먼저 catch에 자식먼저 넣고 
 	다음 catch에 부모 넣고
 	그 다음 catch에 부모를 넣는 식으로 해야한다~
 	Exception이 ArithmeticExeption 부모임
 	그래서 Exception을 뒤에 넣어줘야댐
 	// 현장에서는 Exception 만 쓴다함 블럭도 비워놓고
 */
