package ch07.ex03.dao;

import ch07.ex03.domain.User;

public class UserDaoImpl implements UserDao {

	// ���������� DB�� ���µ� ������ DB��� �а�
	private User user;
	
	@Override
	public User selectUser() {
		return this.user;
	}
	
	@Override
	public void insertUser(User user) {
		this.user = user;
	}
}
// �б� select �߰� insert ���� delete
// CRUD �б� ���� �߰� ���� ( create read update delete  )