package ch05.ex05.case09;

public class Cat {
	private String name;
	
	public Cat breed() {
		return new Cat();	// 어미고양이가 아기고양이를 낳다.
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
