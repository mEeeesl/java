package ch07.ex05.case07;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
/*
리스트는 key를 알아서 지정
map은 key를 내가 지정

*/