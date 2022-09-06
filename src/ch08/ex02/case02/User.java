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
					"이미 최고 등급인 " + this.level + "입니다. ");
		
		this.level = nextLevel;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", name, level);
	}
}
/* 
  	domain에서 처리할 수 있으면 service layer에 안두고 domain에다가 둠

	골드 담에 Null 나오니까 위험함. 예외처리 해줘야댐
	지금까지는 내가 코딩한거에 이상한 값을 입력해야 예외처리였지만
	throw - run time error를 일부로 발생시킴
	
	Main을 Call한 VM이 Exceptoin 객체 받아서 
	Console창에다가 이미 최고 등급인 GOLD 입니다.
	보내고 앱을 죽게하고 종료시켜버림.
	
	이거 해결하는건 Main에 있는 try { } catch () {}
	이거하면 앱이 죽지 않음
	
	
*/