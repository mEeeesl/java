package ch05.home.ex05.case06;

public class Phone {
	private String brandName; //brand(��ü)���� brandName(�Ӽ�)�� ������ڡ�
	private int price;
	
	public void sendMsg() {}
	public void call() {}
	public void playGame() {}
	
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
/*
 * ���Ѽ��� �Ｚ���� 1�鸸�� �ְ� ��
 * �տ� �� ���� ���� �幵
 * 
 * �޼��� ������
 * ������ ����, ��ȭ�� �ɾ��, ������ �ȵ�
 * ��� �ڿ� �ٽ� �����غ�������.
 * �� ���� �����ΰ�����.
 * 
 * 1. �Ｚ���� ��������� �鸸�� + �Ｚ + �޼������ + ��ȭ��� ���ӱ��
 * 2. ���Ѽ� > ���Ѽ� Ŭ�������� �� >
 */