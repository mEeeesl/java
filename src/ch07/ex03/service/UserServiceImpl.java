package ch07.ex03.service;

import ch07.ex03.domain.User;
import ch07.ex03.dao.UserDao;

public class UserServiceImpl implements UserService {
	private UserDao userDao;	//���� ������ ������ô� ���� ���̿�
	
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
// ��ü�� ���� �ٷ� �� ��ü�� ����
// dao�� service�� ���
// service�� dao���� ��� presentation�̶��� ����
// preserntation�� service�� ����
// ��ȭ�� - 1. �޼ҵ带, 2. ���ϰ� �ޱ�