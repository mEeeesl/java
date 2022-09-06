package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		/* int hour = 23;
		
		if(hour < 12) {
			System.out.println("Good Morning");
		} else if(hour < 18) {
			System.out.println("Good Afternoon");
		} else if(hour < 21) {
			System.out.println("Good Evening");
		} else if(hour < 24) {
			System.out.println("Good Night");
		} else {
			System.out.println("Retry");
		} */
		
		// 가독성 높게 다시 만들기 
		
		int hour = 13;
		String bow = "";
		
		if(hour < 12) bow = "Good Morning";
		else if(hour < 18) bow = "Good Afternoon";
		else if(hour < 21) bow = "Good Evening";
		else if(hour < 24) bow = "Good Night";
		else bow = "Please, retry";
		
		System.out.println(bow);
	}
}