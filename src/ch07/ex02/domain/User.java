package ch07.ex02.domain;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
/*	domain -> dao -> service -> presentation
	
	domain �����۾�. data�� �ʿ��ϴϱ� + DTO (���� ���ƴ��)
 	
 	persistence layer 	- Dao		= ü������ data�� ��� DB�� ����
 	service layer		- Service
 	presentation layer	- Io
 	
 	3�������� ������ ����
	> ���� dao������ �迭�� ��
	> ���߿� ������� dao���� DB�� �̿� 
	> Code �޶���
	> ���� ������ �Ȱǵ��̰�
	> �۽ý�Ʈ ������ �ǵ��̸��

*/