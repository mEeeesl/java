package ch08.ex03.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			int result = arr[10];
		} catch (ArrayIndexOutOfBoundsException e����) {
			System.out.println("���ܰ� �߻��߽��ϴ�. arr[] 10���Ϸ� ���ڳ�������");
		}
		
		
		System.out.println("��.");
	}
}
/*
�����ڰ� ������ �������� �ذ� ���� ��
try { } catch (){} ���°�.

try code�� �� �� �� ������ ���� �ڵ巡

ArrayIndexOutOfBoundsException ��������
���忡���� Exception < �̰͸� �� ���� ū ������ �θ�

*/