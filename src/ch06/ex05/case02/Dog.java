package ch06.ex05.case02;

public class Dog extends Animal {
	private int age;
	
	public Dog(int age) {
		super(age);			// ���⿡ age 1000
		this.age = age;		// ���⿡ age 1
	}
	
	@Override
	public int getAge() {
		return age;			// Dog Ÿ�� age = 1
	}
}
