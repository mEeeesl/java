package ch08.ex02.case02;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		User user1 = new User("최한석", Level.COPPER);
		User user2 = new User("한아름", Level.SILVER);
		User user3 = new User("양승일", Level.GOLD);
		
		// 미리 data가 있을 때, List 만드는 경우
		List<User> users = Arrays.asList(user1, user2, user3);
		
		users.forEach(user -> { 
			try {
				user.upgradeLevel();
			} catch(IllegalStateException e) {}
		});
		
		System.out.println(users);
	}
}
/*
 	Arrays.asList( ) - 적극 사용권장
 	forEach() iterating - 적극 사용권장
 	
	Main을 Call한 VM이 Exceptoin 객체 받아서 
	Console창에다가 이미 최고 등급인 GOLD 입니다.
	보내고 앱을 죽게하고 종료시켜버림.

	이거 해결하는건 Main에 있는 try { } catch () {}
	이거하면 앱이 죽지 않음
*/