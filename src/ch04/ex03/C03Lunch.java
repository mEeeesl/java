package ch04.ex03;

public class C03Lunch {
	public static void main(String[] args) {
		
		// 5의 배수는 상한것
		// 배부른 칼로리는 30 칼로리
		// 배 부를 때까지 먹을거야.
		// 배가 고프면 먹어야지
		// 배가 고프다 = 칼로리가 30 미만
		
		int calorie = 0;
		int food = 0;
			
		// while = 0회 이상 실행한다.
		// do ~ while = 1회 이상 실행한다.
		// break; = 가장 인접한 조건문에서만 빠져나오고 
		// 그 이후 조건문에는 영향을 미치지 못한다
		
		while(calorie < 30) {
			food = (int)(Math.random() * 10) + 1;
			
			if(food % 5 == 0) {
				System.out.println("상한 음식을 뱉다.");
				break;
			}
			
			calorie += food;
		}
	
		System.out.println(calorie + "cal.만큼 먹었습니다.");
	}
}