package ch05.ex05.case04;

public class Main {
	public static void main(String[] args) {
		// public - �ܺο��� �� ����
		// static - Main Ŭ���� ��ü �������ʰ� �� ȣ�� ����
		// void - return�� ������
		// main - �̸�
		// String[] - ��Ʈ��Ÿ������ �޴µ� ?
		// args - �ܺο��� hello world ġ�� args�� ���±���
		
		Dog dog = new Dog();
		
		dog.setName("�п���");
		dog.setBreed("������");
		
		dog.shout();
		dog.eat();
		// ������ �п��̰� ¢��. �Դ�.
	}
}
