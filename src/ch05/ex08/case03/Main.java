package ch05.ex08.case03;

public class Main {
	public static void main(String[] args) {
		Citrus citrus = new Citrus();
		System.out.println(citrus.getName());
		// new Citrus () �ϸ� �� new Citrus�ϰ� 
		// 2��° ������ Citrus�̸��� "�Ѷ��"�̴�
		// ���⼭ println�� ó�� ������ new Citrus�� �̸��� ���°Ŷ�
		// 1��° ������ �༮�̸��� ���������� null��
		// �׷��� 
		// public Citrus() {
		// 		new Citrus("�Ѷ��"); << �̰ž��� 1������null 2��°�� �Ѷ��
		// 		this.name = "õ����"; << �̰Ž�ߴ�, �ٵ� �̰ž��� Ȯ�强�������� ������
		// }
		// �̷��� this. ���°Ű� this.name = name; �̷������� �ϴ°� ����
		
		citrus = new Citrus("������");
		System.out.println(citrus.getName());
		
		Citrus citrus1 = new Citrus("������");
		Citrus citrus2 = new Citrus("����");
		System.out.println(citrus1.getName());
		System.out.println(citrus2.getName());
	}
}
