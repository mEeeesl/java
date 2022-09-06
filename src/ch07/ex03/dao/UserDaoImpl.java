package ch07.ex03.dao;

import ch07.ex03.domain.User;

public class UserDaoImpl implements UserDao {

	// 실전에서는 DB로 가는데 지금은 DB대신 둔거
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
// 읽기 select 추가 insert 삭제 delete
// CRUD 읽기 쓰기 추가 삭제 ( create read update delete  )