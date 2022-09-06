package ch06.ex06.case08;

public interface Animal {
	default void eat() {
		System.out.println("입으로 먹다.");
	}
	
	void move();
}
/*	default method
 *	인터페이스는 원래 바디가 없음
 *	바디 붙이려면 default or static 이용
 * 	인터페이스에서 바디가 있는 메소드를 default 메소드라 부름
 * 	default method - 중복값 최소화
 *  여기서 default로 했으니 다른 패키지에서는 못 쓰는건가? 집에서 해보기
 *  
 */	
