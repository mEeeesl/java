package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
// Flower Class �� �������(��ü�� �Ӽ�)�� String name;, int petalLength;, int cupLength; 3������ 
		
		Flower flower1 = new Flower();
		flower1.name = "â����";
		flower1.petalLength = 7;
		flower1.sepalLength = 2;
		
		Flower flower2 = new Flower();
		flower2.name = "�ڽ���";
		flower2.petalLength = 4;
		flower2.sepalLength = 1;

		// �� ������ ���� String flowerName; String ReceiverName();
	}
} 
/*
 * â������ ���� ���̰� 7cm, �ɹ�ħ ���̰� 2cm �Դϴ�.
 * �ڽ��𽺴� ���� ���̰� 4cm, �ɹ�ħ ���̰� 1cm �Դϴ�.
 * ����� ���ص���
 * 
 * 0. ��ü�� �߻�ȭ�� �ܾ�� Ŭ������ ��� 	>	"Flower flower = new Flower();" 
 * 1. â���� / �ڽ���					>	String type - "name"; 
 * 2. ���ٱ��� 						>	int - petalLength; 
 * 3. �ɹ�ħ����						>	int - sepalLength; 
 */