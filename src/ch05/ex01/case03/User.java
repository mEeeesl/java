package ch05.ex01.case03;
// �� �� ��Ŭ�� > source -> generate Getter and Setter -> 
// -> name, age check! -> generate Ŭ�� ! �� !

// private ������� + public getter & setter �� �����.

public class User {
	private String name;
	private int age;
	
	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
 
	
	
	// String name;	// heap�� ���� - ��ü��
	// int age;
	
	//getter �� setter
	//���ϰ��� ���� = void
	//���ϰ��� �ִ� = ���ϰ��� Ÿ��
	//method �̸��� ����� ���� (�ൿ����Ÿ��)
	// 		method �����
	
	/*
	//	setter
	public void setName(String name) {
		this.name = name;	// this. �Ⱦ��� stack�� ���� - method ���� �ֱ⿡ 
							//�׷��� this.�����ߴ� ��������� �Ҵ��ϱ�����
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//	getter
	//	new = ��ü ����� return = ���ϰ��� ��Ÿ��
	public String getName() {
		return this.name;	// this.name���� name �ص� �Ǳ� �ȴٰ��ϴµ�
	}

	public int getAge() {
		return this.age;
	}
	*/
}
	