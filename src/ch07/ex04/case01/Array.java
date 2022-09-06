package ch07.ex04.case01;

public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3];
		System.out.println(strs);
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
										// 0���ͽ���.
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		// = 0, �ڵ� �ʱ�ȭ�Ǵ°� ���� ��ü�� heap�� ����
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]);
		System.out.printf("%s %s %s\n", strs[0], strs[1], strs[2]);
		// = null, class Ÿ���� �⺻��
		
		//�������ٰ� �����͸� �־ ���
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		// = 0 1 2 
		
		for(int i = 0; i < ints.length; i++) ints[i] = i;
		
		for(int i = 0; i < ints.length; i++)
			System.out.print(ints[i] + " ");
		
		System.out.println("\n");
		
		//iterating(�迭)
		//int i- ���Ҹ� �������� , ints - collection
		//for each��� �θ���.
		for(int i: ints) System.out.print(i + " ");
		
		//�̰͵��� �߾Ⱦ� ������ ���̾����� 
		int[] array = {0, 1, 2};
		array = new int[] {0, 1, 2};
	}
}
/* �迭�� ���� ��List�� �ַ� �� �ű�� ��. �ϴ� ������� ���� ����
 * String ���� [] �迭
 * String[] = ���ڿ��� �迭�� ����ϰڴ�. 
 * String data�� n�� ���� �� �ִ� �迭 Ÿ��
 * strs�� �װ� ���� ���� ( args�� �������̶� args�� �ƴϾ ����� )
 * 
 * ��ü�ϱ� new�� 
 * new dataType length
 * new String[3] => String Ÿ���� ���� �� �ִ� �迭��ü 3���� ���� 
 * 
 * ������Ÿ��[] ���� = new ������Ÿ��[length]
 * 
 * Integer = wrapper class�� �θ�
 * int ������ Ŭ������(��ü��) �����; ��� 
 * 
 * �Ϲݰ�ü������ ������ �� �����������
 * �迭��ü������ �˾Ƽ� �� ������ ints[0] strs[1] �̷���ó��
 * 
 * �Ϲݰ�ü������ data type�� ������
 * �迭��ü������ data type�� �ϳ��� ����
 * 
 * iterating = �迭 
 * */
