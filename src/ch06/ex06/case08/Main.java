package ch06.ex06.case08;

public class Main {
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Goose goose = new Goose();
		
		//eat(){} - default로 조져놔서 값 동일 + 중복값 최소화
		elephant.eat();
		goose.eat();
		
		// ▼ 얘네는 @Override
		elephant.move();
		goose.move();
		
		
	}
}
