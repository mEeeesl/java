package ch07.ex01.case07;

public class Main {
	public static void main(String[] args) {
		Human human = new Human();
		Kimchi kimchi = new Kimchi();
		Ramen ramen = new Ramen();
		
		human.eat(kimchi);
		human.eat(ramen);
		human.eat(new Apple());
		
		
		/*
		Food food = new Ramen();
		Food food2 = new Kimchi();
		Food food3 = new Apple();
		
		Ramen ramen = (Ramen)food;
		Kimchi kimchi = (Kimchi)food2;
		Apple apple = (Apple)food3;
		
		human.eat(ramen);
		human.eat(kimchi);
		human.eat(apple);
		
		//human.eat(ramen, kimchi, apple);
		*/
	}
}
