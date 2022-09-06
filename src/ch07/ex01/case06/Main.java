package ch07.ex01.case06;

public class Main {
	public static void main(String[] args) {
		Human human = new Student();
		human.sleep();
		//human.study(); - Error
		
		Student student = (Student)human;
		student.study();
		student.sleep();
	}
}
/*	polymorphism = 다형성 	
 * 	객체가 2개 이상의 타입을 갖고있는 것이다.
 *	부모클래스에서 상속을 받은 멤버들만 접근 할 수 있고,
 *	자식클래스에서 만들어진 멤버들에게는 접근 할 수 없다.
 *
 *	객체를 자식타입으로 두면 다 가능 ( 하나의 방법이 될 수 있음 )
 *	타입에 맞는 행동을 하는겨.
 *	
 */
