package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("human say.");
		human.say();
		Human.walk();
		//human.walk(); - Error static Type
		human.sleep(); 	// default 같은 패키지내 공유
		
		human = new Student(); // promotion 
		human.say();
		//human.walk(); - static Type
		human.sleep();	// defualt 
		
	}
}
