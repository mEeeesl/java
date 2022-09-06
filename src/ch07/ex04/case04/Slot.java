package ch07.ex04.case04;

public class Slot {
	private Ball[] balls;
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1);	// i = 0 �϶� 1�� �� ����
	}
		//	�� return type
	public Ball chuck() {
		int i = 0;
		Ball ball = null;

		do {
			i = (int)(Math.random() * 45);	// i = 0 ~ 44 �� 1��
			ball = balls[i];
			balls[i] = null;
		} while(ball == null);
		
		return ball;
	}
}

