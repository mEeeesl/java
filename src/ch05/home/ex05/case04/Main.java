package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		
		//man.come();
		//man.sit();
		//man.introduceYourself();

		man.setName("���Ѽ�");
		man.setAge(33);
		man.setBirthDay(LocalDate.of(2025, 6, 7));
		
		//man.waitOrder();
		man.sing();
		man.eat();
		//man.finishEating();
		man.run();
	}
}
/*
����]
���ڸ��� ��ü�� �������϶�.

�Ĵ翡�� �� ���ڰ� �ٰ��� �ɽ��ϴ�. / ����, �ٰ�����, �ɴ�
���ڰ� �ڱ�Ұ��� �մϴ�. / �ڱ�Ұ��� �ϴ�.
�̸��� ���Ѽ�, ���̴� 33��, ������ 2025-6-7 �Դϴ�. / �̸�, ����, ����

���ڴ� ������ ��ٸ��� ����, �뷡�� �θ��ϴ�. / �뷡�� �θ���
������ ������ ���ְ� �Խ��ϴ�. / �Դ�
�� �Դ���, ��� ���ϰ�, �޷� �����ϴ�. / ��������
*/
