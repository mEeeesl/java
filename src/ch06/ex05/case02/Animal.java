package ch06.ex05.case02;

public class Animal {
	private int age;
	
	public Animal(int age) {
		this.age = age * 1000;
	}
	
	public void shout() {
		System.out.println("������.");
	}
	
	public int getAge() {
		return this.age;	// this.age = AnimalŸ�� age = 1000
	}
}
