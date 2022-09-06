package ch06.ex05.case02;

public class Dog extends Animal {
	private int age;
	
	public Dog(int age) {
		super(age);			// 여기에 age 1000
		this.age = age;		// 여기에 age 1
	}
	
	@Override
	public int getAge() {
		return age;			// Dog 타입 age = 1
	}
}
