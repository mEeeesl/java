package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		//Card�� ��ü�� ������ static����(Class����) ȣ�Ⱑ��
		//Card card = new Care(); - Card ��ü ���� �� ���¿��� ȣ�Ⱑ��
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
		
		//static���� ������� card1�� card2�� width�� ���ιٲ� ����;
		//code ��¥�ߴ� ���� �̷��� static���� �� �Ⱦ��°� ���ٰ���
		card1.width = 100;	 
		System.out.printf("card1 width: %d, card2 width: %d\n", card1.width, Card.width);
	}
}
