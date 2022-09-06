package ch07.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Life alien = new Life();
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat();
		alien2.eat(); 
		// static method - 상속이 안되기에, @Override 불가
		System.out.println(" - - - - ");
		
		alien.shout();
		alien1.shout();
		alien2.shout();
		System.out.println(" - - - - ");
		
		// Class.method(); - 이렇게 쓰는게 Best★
		Life.eat(); 	
		Alien.eat();
		//Life.shout(); - static method만 class.method(); 가능
	}
}
// @Override 하면, 자식의 method를 쓴다.