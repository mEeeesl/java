package ch05.ex05.case09;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("�Ƹ���");
		
		Cat cat2 = cat.breed(); // �Ƹ��̰� ���� �Ʊ�����
		cat2.setName("ưư��");
		
		System.out.println(cat.getName() + " " + cat2.getName());
	}
}
