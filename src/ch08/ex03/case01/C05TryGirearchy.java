package ch08.ex03.case01;

public class C05TryGirearchy {
	public static void main(String[] args) {
		
		try {
			int i = 3 / 0;
		} catch(ArithmeticException e����) {
			System.err.println("ArithmeticExeption�� �߻��߽��ϴ�. ����");
		} catch(Exception e����) {
			System.err.println("Exception�� �߻��߽��ϴ�. ���� ");
		}
	}	
}
/* 	exception �ص� �ڽĸ��� catch�� �ڽĸ��� �ְ� 
 	���� catch�� �θ� �ְ�
 	�� ���� catch�� �θ� �ִ� ������ �ؾ��Ѵ�~
 	Exception�� ArithmeticExeption �θ���
 	�׷��� Exception�� �ڿ� �־���ߴ�
 	// ���忡���� Exception �� ������ ���� �������
 */
