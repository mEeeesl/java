package ch07.ex06.case02;

public class Alien extends Life {
	// @Override static method�� ����� �ȵǱ� ������, @Override �Ұ�
	public static void eat() {
		System.out.println("Alien�� �Դ�.");
	}
	
	@Override
	public void shout() {
		System.out.println("Alien�� �Ҹ�ġ��.");
	}
}
/* �ν��Ͻ� ��������� ����ϴ°� Override�� ����� �ް��� ������ �ȵ� 
 * �ڱ� ��Ÿ�Ϸ� �ٲٷ��� �ϴ°ǵ� static�̶� ��� ��ü�� ������
 */
