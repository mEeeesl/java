package ch07.ex06.case06;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>();
		Cabinet<B> cabinet2 = new Cabinet<>();
		// Cabinet<C> cabinet; - Error A ���� Ÿ�Կ� C�� ������ ����.
		
		A[] arr1 = {new A(), new A()};
		B[] arr2 = {new B(), new B()};
		C[] arr3 = {new C(), new C()};
		D[] arr4 = {new D(), new D()};
		
		// �� T�κ�
		cabinet1.getLastVal(arr1);	// A ���� ����
		cabinet1.getLastVal(arr2);	// A ������ B ���� - promotion B>A 
		cabinet2.getLastVal(arr2);	// B ���� ����
		//cabinet2.getLastVal(arr1); Error
		
		/* �� S�κ�
		cabinet1.getFinalVal(arr1); // Error - C ���ϸ� ����
		cabinet1.getFinalVal(arr2); // A, B ��� C ���ϰ� �ƴ� */
		cabinet1.getFinalVal(arr3);	// C ���� ����
		cabinet1.getFinalVal(arr4); // C ������ D ����
		
		/* �������Ҷ� ���� �̿��� �� ������� ��, method �� �Ҷ� ������� ��
		   �̹� �����ϴ� Ŭ������, ����ϴ� ������ ������ ��
		
		   ���� �̹� ���ʸ� ����� ���µ�,
		   ������ �޼ҵ带 ���鶧 �� ���� ���ʸ�Ÿ�� ������Ű�¹� - ���� case 
		*/ 
	}
}
