package ch05.ex05.case04;

public class Dog {
	private String name;
	private String breed;
	
	// public int fight() {return 0;} �����θ��� �ϰ� �ؿ�ó�� �����ص���
	//public void figh(){}
	
	public void eat() {} // �Դ� ������ ������ return ���� ���ٰ�ġ��. �׷��� void
	public void shout() {} // ¢���� �Ҹ��� ������, ��������� ����¢���� ���ɾ���ġ��. void 

	// getter ���� setter => �����ʰ� ���⸸ �ϰڴ�.
	// ������ �̸��� ��� �ʿ䵵 ���ٴ� ���ε�.
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
