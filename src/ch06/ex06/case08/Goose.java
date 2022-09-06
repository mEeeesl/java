package ch06.ex06.case08;

public class Goose implements Animal {
	@Override
	public void move() {
		System.out.println("날아가다.");
	}
}
/*	default로 eat 바디 조져놔서 여기선 따로 @Overrid 안해도됨
*/