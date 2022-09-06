package ch06.ex06.case08;

public class Elephant implements Animal {
	@Override
	public void move() {
		System.out.println("걸어가다.");
	}
}
/*	default로 eat 바디 조져놔서 여기선 @Override eat() 안해도됨
 */