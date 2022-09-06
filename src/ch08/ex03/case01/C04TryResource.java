package ch08.ex03.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C04TryResource {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		try (	// try 블럭에 resource를 선언
			PrintWriter out1 = new PrintWriter(new FileWriter("C:/DEV/1.txt"));
			PrintWriter out2 = new PrintWriter(new FileWriter("C:/DEV/2.xtx"));	
		){
			for(int i = 0; i < arr.length; i++) {
				out1.println("arr[" + i + "]: " + arr[i]);
				out2.println("arr[" + i + "]: " + arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException eㅎㅎ) {
			System.out.println("배열 예외가 발생했습니다.");
		} catch(IOException eㅎㅎ) {
			System.out.println("IO 예외 발생했습니다.ㅎㅎ");	
		} 
		
		System.out.println("끝.");
	}
}
/*
out.close() 안해도 되는법
> 

데이터를 파일에 저장안하고 DB에 저장하기때문에
이런게 있다 ~ 라는 정도만

// 현장에서는 Exception 만 쓴다함 블럭도 비워놓고

*/