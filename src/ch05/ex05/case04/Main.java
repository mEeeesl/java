package ch05.ex05.case04;

public class Main {
	public static void main(String[] args) {
		// public - 외부에서 콜 가능
		// static - Main 클래스 객체 만들지않고 걍 호출 가능
		// void - return값 없구나
		// main - 이름
		// String[] - 스트링타입으로 받는데 ?
		// args - 외부에서 hello world 치면 args로 들어가는구나
		
		Dog dog = new Dog();
		
		dog.setName("왈왈이");
		dog.setBreed("진도개");
		
		dog.shout();
		dog.eat();
		// 진도개 왈왈이가 짖다. 먹다.
	}
}
