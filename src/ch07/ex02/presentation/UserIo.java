package ch07.ex02.presentation;

import ch07.ex02.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;	// DI(Dependency Injection) - 멤버변수를 초기화 한다. / 객체와 객체간의 관계를 맺을 것임을 암시
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
}
//IO는 출력하고 끝날거라 interface를 만들지 않을것임.