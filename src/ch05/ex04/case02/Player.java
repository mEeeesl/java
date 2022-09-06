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
	// static 변수라 객체생성 필요없이 읽고쓰기가능
	// Math.random()도 static변수라 바로 읽기쓰기가능
	
	public static String getTeamName() {
		return teamName;
	}

	public static void setTeamName(String teamName) {
		Player.teamName = teamName;
	}
}