package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat("�����");	//promotion
		animals[1] = new Dog("�п���");	
		animals[2] = new Dog("��ŭ��");
		
		//iterating ( Animal�� �о�� ����� ������ �� ���� )
		for(Animal animal: animals)
			System.out.println(animal);
		
		Object[] objs = new Object[3];
		
		objs[0] = new Cat("�̷���");	//Cat�� promotion - object ��
		objs[1] = new Dog("�̿п�");
		objs[2] = new Dog("��ŭ��");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
/* ' generic type ' ź�����
 	AnimalŸ���̾ƴ�, AnimalŸ���� �� �� �ִ� �迭 ��ü�� ����°Ŵϱ� ����
 	Object�� �ع����� ������ ��ü���� �� �� �ֱ⶧���� �Ⱦ��ٰ� ��.
 	�پ��� ��ü�� ���� �޾Ʊ׷�? => ' generic type '
 	��ü�� �����ϴ� �������� �� ��ü�� Ÿ���� ����⶧���� ���� NoNo��� ��
*/