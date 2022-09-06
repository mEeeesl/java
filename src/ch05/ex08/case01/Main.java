package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby();
		// 사실 public Baby(){} 를 Call한 것임
		// Class.method - static method 
		// 객체.method - instance method
		// new method - 생성자 method
		
		baby.setName("초롱이");
		
		Baby baby2 = new Baby("튼튼이");
		
		System.out.println(baby.getName() + "와 " + baby2.getName());
	}
}
