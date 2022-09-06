package ch07.ex05.case08;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Dove dove = new Dove();
		Duck duck = new Duck();
		Lion lion = new Lion();
		Leopard leopard = new Leopard();
		
		List<Creeper> pen = new ArrayList<>();
		pen.add(lion);
		pen.add(leopard);
		//pen.add(dove); - error List<Creepr> �̱� ����
		
		List<Bird> cage = new ArrayList<>();
		cage.add(dove);
		cage.add(duck);
		//cage.add(lion); - error List<Bird> �̱� ����
		
		//���ݺ��� ���ε��� ���� �� ����.
		
		for(Creeper creeper: pen) creeper.walk();	//�����µ� �ϳ��� ������ ���Ű��
		for(Bird bird: cage) bird.fly();			//���� �ϳ��� ������ ���Ű��
	}
}
