package ch04.home.ex03;

public class Money {
	public static void main(String[] args) {
		int price = 30_000;
		int tot = 0;	// �տ� �� ��
		int tmp = 0;	// ���� ��
			
		while(tot < price) {
			tmp = ((int)(Math.random() * 30) + 1) * 1000; // 1,000����
			System.out.println(tmp);
			tot += tmp;
		}
		
		System.out.printf("\n%d���� ���½��ϴ�.", tot);
		
		// unit test
		// integration test
		/*int money = 0;	//	���� ��
		int tot = 0;		//	�Ѿ�
		
		while(tot < 30_000) {
			money = (int)(Math.random() * 30000 )+ 1000;
			
			if (money % 1000 == 0) {
				System.out.print(money + "��\n");
				tot += money;
			}
			
			if (tot >= 30_000)  break;
		}
		
		System.out.println(tot + "���� ���½��ϴ�.");*/
	}
}
/*
���� ]
3����¥�� ���ǰ��� ġ���. => x < 30000

�������� ���� ������ ������ => �ݺ���

������ 5�������� ����. => (int)Math.random()*30000 > 
 
���� ���� ��(����)�� �������� �ʴ´�.

�ѹ��� 3���� ���ϸ� ������. (int)Math.random()*30000 >

���� ������, ���� �ݾ��� ����Ѵ�. tot += tot xx // 
money = %d�� ���½��ϴ�. , money
tot += money // tot+"���� ���½��ϴ�." 

 �ʿ��� �� = �ݾ�, ����(��Ż)
 
 12000
 2000
 6000
 10000
 
 30000���� ���½��ϴ�.
*/