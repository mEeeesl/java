package ch08.ex03.case01;

public class C06Throws {
	/*
	public void first() {
		this.second();
	}
	
	
	public void second() {
		try {
			this.third();
		} catch(Exception e) {}	
	}	// {} �����ϰ� �ؿ� Main�� new ~.first(); ���� �� �� ����Ϸ� ��
	*/
	
	public void first() {
		try {
			this.second();
		} catch(Exception e����) {}
	}
							 // �� throws Exception �ϸ� ����ó�� second()�� try ������ �����
	public void second() throws Exception {	
		this.third();
	}
	
	public void third() {
		int i = 3 / 0;
	}
	
	public static void main(String[] args) {
		new C06Throws().first();
		System.out.println("��");
	}
}
//���忡���� Exception �� ������ ���� �������

// throw = �� �ȿ� ��
// throws = �� �ۿ� ��