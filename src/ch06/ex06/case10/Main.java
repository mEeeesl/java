package ch06.ex06.case10;

public class Main {
	public static void main(String[] args) {
		BusCard card = new BusCard() {
			@Override
			public void tagOn() {
				System.out.println("tag On.");
			}
			
			
			@Override
			public void tagOff() {
				System.out.println("tag Off.");
			}
		};
		
		card.tagOn();
		card.tagOff();
	}
}
/*	interface������ ��ü�� ���� �� �ִ�( new Class(); ) ������ִ�.
 *	new BusCard(){ };
 *  ����ī�� �������̽��� ��ӹ��� �̸����� � Ŭ������ �ִµ�, 
 *  �̸����� �� Ŭ������ ���� �����ϴ°��̴�.
 *	�͸� Ŭ������ ����ī�� �������̽��� ��ӹ����͸� ���´�.
 *	�׷��� �� ������ @Override ���ָ�ȴ�. 	
 * 	��� Ŭ���� �� ���� ; �ٿ���ߴ��.
 * 	
 * 	�̷� �̸����� Ŭ������ �ܼ� 1ȸ�뿡 ��ġ�Ƿ�, ���� ���� �ʴ´�.
 *  �̺�Ʈ ������ �Ҷ��� ���δ��Ѵ�.
 * 	android �����ڴ� ���ٰ� �ϴµ� �츮�� ���� �Ƚᵵ �ȴ���.
 * 	
 * 	
 * 	
 * 	
 */