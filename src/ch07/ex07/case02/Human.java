package ch07.ex07.case02;
@FunctionalInterface
public interface Human {
	void say(); // �߻�޼ҵ带 �ϳ� ���� �� �̾�

	// default, static method�� �󸶵��� �� �� �� ���� ( �߻�޼ҵ尡 �ƴϴϱ�)
	
	static void walk() {
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
	
}
