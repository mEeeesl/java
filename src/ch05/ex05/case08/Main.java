package ch05.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Mom mom = new Mom();
		Child child = new Child();
		
		//아가는 먹는다( 마미가 요리한거슬 )
		child.eat(mom.cook());
	}
}
