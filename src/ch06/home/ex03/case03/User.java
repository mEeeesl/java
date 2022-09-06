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
		// 1번 - return name + " " + age + "살";
		return String.format("%s %d살", name, age); 
		// format() - 이거 자주 쓴다고함
	}
}