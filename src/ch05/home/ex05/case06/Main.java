package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		Phone phone = new Phone();
		
		person.setName("���Ѽ�");
		person.setPhone(phone);
		phone.setBrandName("�Ｚ");
		phone.setPrice(1_000_000);
		
		person.sendMsg();
		person.call();
		person.playGame();
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
 * Class phone > 1. price 2. brand 3. �޼������/��ȭ���/���ӱ��
 * Class man > 1. name 2. phone���� �޽���/��ȭ/�����ϴ�
 */
