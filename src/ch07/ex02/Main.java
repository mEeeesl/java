package ch07.ex02;

import ch07.ex02.dao.UserDao;
import ch07.ex02.dao.UserDaoImpl;
import ch07.ex02.presentation.Console;
import ch07.ex02.presentation.UserIo;
import ch07.ex02.service.UserService;
import ch07.ex02.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		Console.info("시작.");
		userIo.play();
		Console.info("끝");
	}
}
/* 	userService has a userDao
	userIo has a userService
 	객체들의 집합 = 앱
 	지금 service는 userIo가 userDao의 연결역할 다리역할 하고있음
	코드의 양이 가장많은건 service임.
	
*/