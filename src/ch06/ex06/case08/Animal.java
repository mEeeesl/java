package ch06.ex06.case08;

public interface Animal {
	default void eat() {
		System.out.println("������ �Դ�.");
	}
	
	void move();
}
/*	default method
 *	�������̽��� ���� �ٵ� ����
 *	�ٵ� ���̷��� default or static �̿�
 * 	�������̽����� �ٵ� �ִ� �޼ҵ带 default �޼ҵ�� �θ�
 * 	default method - �ߺ��� �ּ�ȭ
 *  ���⼭ default�� ������ �ٸ� ��Ű�������� �� ���°ǰ�? ������ �غ���
 *  
 */	
