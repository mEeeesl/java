package ch04.ex03;

public class C03Lunch {
	public static void main(String[] args) {
		
		// 5�� ����� ���Ѱ�
		// ��θ� Į�θ��� 30 Į�θ�
		// �� �θ� ������ �����ž�.
		// �谡 ������ �Ծ����
		// �谡 ������ = Į�θ��� 30 �̸�
		
		int calorie = 0;
		int food = 0;
			
		// while = 0ȸ �̻� �����Ѵ�.
		// do ~ while = 1ȸ �̻� �����Ѵ�.
		// break; = ���� ������ ���ǹ������� ���������� 
		// �� ���� ���ǹ����� ������ ��ġ�� ���Ѵ�
		
		while(calorie < 30) {
			food = (int)(Math.random() * 10) + 1;
			
			if(food % 5 == 0) {
				System.out.println("���� ������ ���.");
				break;
			}
			
			calorie += food;
		}
	
		System.out.println(calorie + "cal.��ŭ �Ծ����ϴ�.");
	}
}