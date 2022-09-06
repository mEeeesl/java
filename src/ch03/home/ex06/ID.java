
package ch03.home.ex06;

import java.util.Scanner;

public class ID {
	public static void main(String[] args) {
		/* 과제
		   주민등록번호를 입력한다.
		   남녀를 판단해서 출력한다.	 
		
		   주민등록번호: 201514-1230452
		   남자입니다. (여자입니다.)
		*/

	Scanner sc = new Scanner(System.in);
	boolean isRun = false;
	String num = "";
	String point = "";
	String ans = ""; 
		
		do {
			System.out.print("주민등록번호: ");
			num = sc.nextLine();
			
			point = num.substring(7, 8);
	
			if(point.length() == 1 && '1' <= point.charAt(0) && point.charAt(0) <= '2') {
				isRun = true;
				switch(point) {
				case "1": ans = "남자입니다."; break;
				case "2": ans = "여자입니다.";
				}
			} else ans = "다시 입력해주세요.";
		} while(!isRun);
		
		/* 
		if (point.equals("1")) ans = "남자입니다.";
		else if (point.equals("2")) ans = "여자입니다.";
		else ans = "다시 입력해주세요."; 
		*/
		
		System.out.println(ans);
		
		/* 
		ans = point.equals("1") ? "남자입니다." : point.equals("2") ? "여자입니다." : "다시 입력해주세요.";
		System.out.println(ans);
		*/
		
	}
}		