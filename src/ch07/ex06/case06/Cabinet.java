package ch07.ex06.case06;

public class Cabinet <T extends A>{ // A class�� �����ִ� class�� ���� 
									// A ���� Ÿ��
									// A�� �θ� Class�� �δ� class
									// A, B class
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	}
}
/* generic type�� ������ ���� ��� �޾Ƶ��ϼ� ������, 
 * ������ �������� ���� ���� ����
 * 
 * ���ʸ� �޼ҵ忡�� extends �� �� ��
 */