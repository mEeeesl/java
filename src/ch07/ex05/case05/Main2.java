package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Cat> floor1 = new ArrayList<>();
		List<Cat> floor2 = new ArrayList<>();
		List<List<Cat>> house = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("�����" + i));
			floor2.add(new Cat("�߿���" + i));
		}
		
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		house.add(floor1);
		house.add(floor2);
		
		System.out.println("\n - - - - - - - - - - - - -");
		
		System.out.println(house.get(0));
		System.out.println(house.get(1));
		System.out.println(house);
		
		System.out.println("\n - - - - - - - - - - - - -");
		//���� ] 6���� ��������� ���� �Կ�����.
		
		//for(Cat cat: floor1) cat.eat(); 
		//for(Cat cat: floor2) cat.eat();
		for(List<Cat> floor: house)
			for(Cat cat: floor) cat.eat();
	}
}
