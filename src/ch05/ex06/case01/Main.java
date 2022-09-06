package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java."); // static method라 가능
		//Man.tell("I love java."); static method 아니라서 불가능
		
		Man man = new Man();
		man.tell("I love java.");
		
		man.say("Hello"); // 위험함 instance 메시지를 왜곡할 가능성이 있기에
	}
}
