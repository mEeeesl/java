package ch07.ex01.case08;

public class Clerk {
	//public Flower sell(Flower flower) {} 가능하기도함
	public Flower sell(String flowerName) {
		Flower flower = null;
		
		switch(flowerName) {
		case "백합": flower = new Lily(); break;
		case "장미": flower = new Rose();
		}
		
		return flower;
	}
}
