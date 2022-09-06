package ch05.home.ex05.case06;

public class Person {
	// Man has a phone
	private String name;
	private Phone phone;
	
	public void sendMsg() {
		phone.sendMsg();
	}
	public void call() {
		phone.call();
	}
	public void playGame() {
		phone.playGame();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
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
 * 1. �Ｚ���� ��������� �鸸��+�Ｚ + �޼������ + ��ȭ��� ���ӱ��
 * 2. ���Ѽ� > ���Ѽ� Ŭ�������� �� 
 * 
 */