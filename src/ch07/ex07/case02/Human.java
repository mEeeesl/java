package ch07.ex07.case02;
@FunctionalInterface
public interface Human {
	void say(); // 추상메소드를 하나 가질 수 이씀

	// default, static method는 얼마든지 더 쓸 수 있음 ( 추상메소드가 아니니까)
	
	static void walk() {
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
	
}
