package ch05.home.ex01.case04;

import java.util.Scanner;
import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public LocalDate getRegDate() {
		return regDate;
	}
	
}
