package ch05.ex04.case02;

public class Player {
	public String name;
	
	public static String teamName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// static ������ ��ü���� �ʿ���� �а��Ⱑ��
	// Math.random()�� static������ �ٷ� �б⾲�Ⱑ��
	
	public static String getTeamName() {
		return teamName;
	}

	public static void setTeamName(String teamName) {
		Player.teamName = teamName;
	}
}