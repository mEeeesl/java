package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby();
		// ��� public Baby(){} �� Call�� ����
		// Class.method - static method 
		// ��ü.method - instance method
		// new method - ������ method
		
		baby.setName("�ʷ���");
		
		Baby baby2 = new Baby("ưư��");
		
		System.out.println(baby.getName() + "�� " + baby2.getName());
	}
}
