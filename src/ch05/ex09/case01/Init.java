package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	// static (�ʱ�ȭ)��
	//  �� Ŭ������ �ε��� �� ���� 1ȸ�� �����
	static {
		Init.s = 1;		//s = 1;�� �˾Ƹ��� �ٵ�, ��Ȯ�ϰ� Init.s = 1��
		//this.i = 3;	//this�� error�� - 
		//method �Ķ���� ù������ this�� �־ �����־��µ�, ������ ��� ����
		System.out.println("static{} �ʱ�ȭ �Ϸ�");
	}
	
	// instance (�ʱ�ȭ)��
	// �� ��ü(instance)�� �����ɶ�(= new�� ����ɶ�), �����ں��� ���� �����
	
	{
		Init.s = 2;
		this.i = 4;
		System.out.println("{}");
	}
	
	// �� ������ ��� - call ���ؾ� �����
	public Init() {
		Init.s = 5;
		this.i = 6;
		System.out.println("Init()");
	}
	
	// �� ������ ���
	public Init(int i) {
		Init.s = 7;
		this.i = 8;
		System.out.println("Init(int)");
	}
}
