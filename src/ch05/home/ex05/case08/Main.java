package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		player1.setName("���Ѽ�");
		player2.setName("�ѾƸ�");
		player3.setName("�����");

		//player1�� pass�ؼ� ���� return�� ball�� player2�� �޾�
		//player2�� pass�� ball�� 
		//player3�� kick�Ѵ�. 
		player3.kick(player2.pass(player1.pass(ball)));
	}
}
/*
���Ѽ�, �ѾƸ�, ������� �౸�� �Ѵ�.
�Ѽ��̰� �Ƹ������� ���� �н��Ѵ�.
�Ƹ��̴� ���������� ���� �н��Ѵ�.
�����̴� ���� ����.

1. ��
2. ���Ѽ� �ѾƸ� ����� // �н��ϴ�, ����
*/