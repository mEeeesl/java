package ch08.ex02.case02;

public class User {
	private String name;
	private Level level;
	
	public User(String name, Level level) {
		this.name = name;
		this.level = level;
	}
	
	public void upgradeLevel() {
		Level nextLevel = level.next();
		if(nextLevel == null)
			throw new IllegalStateException(
					"�̹� �ְ� ����� " + this.level + "�Դϴ�. ");
		
		this.level = nextLevel;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", name, level);
	}
}
/* 
  	domain���� ó���� �� ������ service layer�� �ȵΰ� domain���ٰ� ��

	��� �㿡 Null �����ϱ� ������. ����ó�� ����ߴ�
	���ݱ����� ���� �ڵ��Ѱſ� �̻��� ���� �Է��ؾ� ����ó��������
	throw - run time error�� �Ϻη� �߻���Ŵ
	
	Main�� Call�� VM�� Exceptoin ��ü �޾Ƽ� 
	Consoleâ���ٰ� �̹� �ְ� ����� GOLD �Դϴ�.
	������ ���� �װ��ϰ� ������ѹ���.
	
	�̰� �ذ��ϴ°� Main�� �ִ� try { } catch () {}
	�̰��ϸ� ���� ���� ����
	
	
*/