package ch06.ex05.case01;

public class Shoes extends Product {
	private int price;	//Product�� price�� �ִ»���
		
	public Shoes (int price) {
		super(price);
		this.price = price;
	}
}
//this. - ������ Ÿ���� �ٸ� = Ŭ������ �ٸ�
//���ⲫ Shoes���� ������� this.price
//���ʲ� Product���� ������� this.price
//�̷������� �ȸ���� ��