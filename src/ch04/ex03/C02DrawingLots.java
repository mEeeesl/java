package ch04.ex03;

public class C02DrawingLots {
	public static void main(String[] args) {
		int random = 1;
		int pickCnt = 0;
		//1 ~ 100 �߿� �ϳ� �̰� 3�� ����� ��ž
		// 3�� ��� ����� =>x % 3 == 0
		// 3�� ����� �ƴϸ�, �̾ƾ���.
		
	
		while(random % 3 != 0) {
			random = (int)(Math.random() * 100) + 1;
			pickCnt++;
		}
		
		System.out.printf("%dȸ �̾Ƽ�, %d�� ã�ҽ��ϴ�.", pickCnt, random);
	}
}
