package ch04.ex03;

public class C02DrawingLots {
	public static void main(String[] args) {
		int random = 1;
		int pickCnt = 0;
		//1 ~ 100 중에 하나 뽑고 3의 배수면 스탑
		// 3의 배수 만들기 =>x % 3 == 0
		// 3의 배수가 아니면, 뽑아야지.
		
	
		while(random % 3 != 0) {
			random = (int)(Math.random() * 100) + 1;
			pickCnt++;
		}
		
		System.out.printf("%d회 뽑아서, %d를 찾았습니다.", pickCnt, random);
	}
}
