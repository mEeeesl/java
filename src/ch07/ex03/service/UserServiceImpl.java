package ch07.ex03.service;

import ch07.ex03.domain.User;
import ch07.ex03.dao.UserDao;

public class UserServiceImpl implements UserService {
	private UserDao userDao;	//유저 서비스의 디펜던시는 유저 디에이오
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
	
	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}
}
// 객체는 보통 바로 옆 객체랑 놀음
// dao는 service랑 놀고
// service는 dao랑도 놀고 presentation이랑도 놀음
// preserntation은 service랑 놀음
// 대화법 - 1. 메소드를, 2. 리턴값 받기