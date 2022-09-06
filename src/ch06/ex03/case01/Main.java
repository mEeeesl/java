package ch06.ex03.case01;
							//Over ride - 바디의 알고리즘을 덮어씀.
public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.shout();
		dog.shout();
	}
}
