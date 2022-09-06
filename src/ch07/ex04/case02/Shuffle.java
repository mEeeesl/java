package ch07.ex04.case02;

public class Shuffle {
	public static void main(String[] args) {
		int[] cards = new int[5];
		
		for(int i = 0; i < cards.length; i++) cards[i] = i;
		 
		for(int i: cards) System.out.print(i + " ");
		System.out.println();

		// 카드 섞는법 중 1개의 예시
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1;
			
			int temp = cards[0]; 
			cards[0] = cards[idx]; 
			cards[idx] = temp;
		}

		for(int i: cards) System.out.print(i + " ");
	}
}
