package ch05.ex08.case02;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate;
	
	public User() {}
	
	public User(String name, int age, LocalDate regDate) {
		this.name = name;
		this.age = age;
		this.regDate = regDate;
	
		//this�� ������. 
		//User ��� Ŭ���� �ȿ��� ���ϱ� 
		//this������ ������Ÿ���� Ŭ���� �̸��� User��.
		//User this ��. ( String nameó�� )
		//�翬�� �Ҹ��� �ϰ��ִ�.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}
