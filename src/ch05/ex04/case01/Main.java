package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		//Card의 객체는 없지만 static변수(Class변수) 호출가능
		//Card card = new Care(); - Card 객체 생성 전 상태에도 호출가능
		System.out.printf("%d, %d\n", Card.width, Card.width);
		
		Card.width = 10;
		Card.height = 20;
		System.out.printf("%d, %d\n", Card.width, Card.height);
		
		//Card.kind;	-	Error
		//Card.number;	-	Error
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("card1: %s, %d\ncard2: %s, %d",
				card1.kind, card1.number, card2.kind, card2.number);
		System.out.printf("\ncard1 width: %d, card1 height: %d\n", Card.width, card1.height);
		
		//static변수 변경순간 card1과 card2의 width값 전부바뀜 ㄷㄷ;
		//code 잘짜야댐 ㄹㅇ 이래서 static변수 잘 안쓰는게 좋다고함
		card1.width = 100;	 
		System.out.printf("card1 width: %d, card2 width: %d\n", card1.width, Card.width);
	}
}
