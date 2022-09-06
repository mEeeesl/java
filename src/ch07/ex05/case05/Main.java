package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>();	
		
		cats.add(new Cat("야코미"));
		cats.add(new Cat("새코미"));
		cats.add(new Cat("달코미"));
		
		System.out.println(cats.get(0));
		System.out.println(cats.get(1));
		System.out.println(cats.get(2));
		System.out.println(cats);
		
		for(Cat cat: cats) cat.eat();
	}
}
//ArrayList 의 5명의 부모중 1개가 List임
//List 기능중 .add .get 두개를 주로 쓸거임