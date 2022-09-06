package ch07.home.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Card[] cards = new Card[5];
	
		for(int i = 0; i < cards.length; i++) 
			cards[i] = new Card(i);
		
	 /*
		cards[0] = new Card(0);		
		cards[1] = new Card(1);		
		cards[2] = new Card(2);		
		cards[3] = new Card(3);		
		cards[4] = new Card(4);
	 */
		for(Card card: cards) System.out.print(card);
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx =(int)(Math.random() * 4) + 1;
			
			Card temp = cards[0];
			cards[0] = cards[idx];
			cards[idx] = temp;
		}
		
		for(Card card: cards) System.out.print(card);
	}
}
/*
ch07.ex04.case02.Shuffle 을 OOP 로 refactoring 하라.
*/