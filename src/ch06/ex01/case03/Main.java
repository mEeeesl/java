package ch06.ex01.case03;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		leopard.eat();
		// leopard.shout(); - Error
		
		lion.run();
		lion.shout();
		// lion.eat(); - Error
	}
}
