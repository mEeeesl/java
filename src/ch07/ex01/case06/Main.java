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
/*	polymorphism = ������ 	
 * 	��ü�� 2�� �̻��� Ÿ���� �����ִ� ���̴�.
 *	�θ�Ŭ�������� ����� ���� ����鸸 ���� �� �� �ְ�,
 *	�ڽ�Ŭ�������� ������� ����鿡�Դ� ���� �� �� ����.
 *
 *	��ü�� �ڽ�Ÿ������ �θ� �� ���� ( �ϳ��� ����� �� �� ���� )
 *	Ÿ�Կ� �´� �ൿ�� �ϴ°�.
 *	
 */
