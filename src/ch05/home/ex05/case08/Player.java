package ch05.home.ex05.case08;

public class Player {
	private String name;
	
	// Player�� Ball�� pass�Ѵ� Ball ball�� �̿��ؼ� , ����� ball�̴�.
	public Ball pass(Ball ball) {
		return ball;
	}
	// Player�� Ball�� kick�Ѵ� Ball ball��, ����� ball�̴�.
	public Ball kick(Ball ball) {
		return ball;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}

