package ch07.ex02.presentation;

import ch07.ex02.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;	// DI(Dependency Injection) - ��������� �ʱ�ȭ �Ѵ�. / ��ü�� ��ü���� ���踦 ���� ������ �Ͻ�
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
}
//IO�� ����ϰ� �����Ŷ� interface�� ������ ��������.