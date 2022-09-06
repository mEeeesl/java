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
		//pen.add(dove); - error List<Creepr> 이기 때문
		
		List<Bird> cage = new ArrayList<>();
		cage.add(dove);
		cage.add(duck);
		//cage.add(lion); - error List<Bird> 이기 떄문
		
		//성격별로 따로따로 모을 수 있음.
		
		for(Creeper creeper: pen) creeper.walk();	//들짐승들 하나씩 꺼내서 운동시키기
		for(Bird bird: cage) bird.fly();			//새들 하나씩 꺼내서 운동시키기
	}
}
