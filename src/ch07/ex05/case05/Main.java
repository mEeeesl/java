package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>();	
		
		cats.add(new Cat("���ڹ�"));
		cats.add(new Cat("���ڹ�"));
		cats.add(new Cat("���ڹ�"));
		
		System.out.println(cats.get(0));
		System.out.println(cats.get(1));
		System.out.println(cats.get(2));
		System.out.println(cats);
		
		for(Cat cat: cats) cat.eat();
	}
}
//ArrayList �� 5���� �θ��� 1���� List��
//List ����� .add .get �ΰ��� �ַ� ������