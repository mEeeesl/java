package ch07.ex05.case03;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);	//key = 0, value = 1
		list.add(2);	//1, 2, 3, 1 = int ����, 
		list.add(3);	//AutoBoxing�Ǽ� Integer type�� �Ǿ� list�� ���
		list.add(1);	//key = 3, value = 1
		
		System.out.println(list);
		
		for(int i: list) System.out.println(i + " ");
			//	�ٵ� ���⼭ int i �� �������� AutoBoxing�Ǽ� int�� �ٲ�?
		System.out.println(" - - - -");
		
		System.out.println(list.get(0)); //������ �б�, �а� �����ִ� ����
		
		for(int i = 0; i < list.size(); i++)	//size�� legth�� ����� ���⼱ 4��
			System.out.print(list.get(i) + " "); 
		System.out.println("\n - - - - ");
		
		//�����͸� ���� �� ���� �ϴ¹�
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.remove(i) + " ");
		
		/*	remove(0) = 1 ���� �� ���� 	> 	{1, 2, 3, 1} > {2, 3, 1}
		 * 	remove(1) = 3 ���� �� ���� 	> 	{2, 3, 1} > {2, 1}
		 * 	remove(2) = list.size() = 2 >	 i == list.size() ���ǽ� ����
		 *	{2, 1}�� ����
		 * 	����� > 1, 3
		 */
		
		// ���� ] remove() list�� ��� ���Ҹ� �����϶�.
		System.out.println("\n - - - - - ");
		
		/*
		int size = list.size();
		for(int i = 0; i < size; i++)
			list.remove(0);
		*/
		for(int i = list.size() - 1; i >=0; i--)
			list.remove(i);
		System.out.println(list);
		
		//	�����Ѱ� ��
		//for(int i = 3; i < list.size(); i--)
			//System.out.print(list.remove(i) + " ");
		
	}
}
//List = key + value
// animals[0] = 1;
//	     key    value