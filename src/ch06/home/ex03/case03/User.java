package ch06.home.ex03.case03;

public class User extends Object {
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// 1�� - return name + " " + age + "��";
		return String.format("%s %d��", name, age); 
		// format() - �̰� ���� ���ٰ���
	}
}