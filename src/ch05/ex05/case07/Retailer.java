package ch05.ex05.case07;

public class Retailer {
	//public Apple sell(Apple apple, int price, int margin) 
	//       ��  ��� �ȸ� ���ϵǴ� ������Ÿ���� Apple�̾���ϴϱ�
	public Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2);	//Margin ����
		return apple;
	}
}
