package ch06.ex05.case01;

public class Product {
	private int price;

	public Product(int price) {
		this.price = price * 2;
	}
	
	public int getPrice() {
		return this.price;
	}
}
//this. - ������ Ÿ���� �ٸ� = Ŭ������ �ٸ�
//���ʲ� Product���� ������� this.price
//���ʲ� Shoes���� ������� this.price
// �̷������� �ȸ����� 