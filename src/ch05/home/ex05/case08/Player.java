package ch05.home.ex05.case08;

public class Player {
	private String name;
	
	// Player는 Ball을 pass한다 Ball ball을 이용해서 , 결과는 ball이다.
	public Ball pass(Ball ball) {
		return ball;
	}
	// Player는 Ball을 kick한다 Ball ball을, 결과는 ball이다.
	public Ball kick(Ball ball) {
		return ball;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}


