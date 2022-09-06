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
	
		//this는 변수다. 
		//User 라는 클래스 안에서 쓰니까 
		//this변수의 데이터타입은 클래스 이름인 User다.
		//User this 다. ( String name처럼 )
		//당연한 소리를 하고있다.
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
