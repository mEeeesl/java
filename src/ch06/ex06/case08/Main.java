package ch06.ex06.case08;

public class Main {
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Goose goose = new Goose();
		
		//eat(){} - default�� �������� �� ���� + �ߺ��� �ּ�ȭ
		elephant.eat();
		goose.eat();
		
		// �� ��״� @Override
		elephant.move();
		goose.move();
		
		
	}
}
