package ch07.ex04.case05.presentation;
//����ó��
import java.util.Scanner;

public class Console {
	private static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}
	//static����� ����Ʈ�ڵ尡 �ε��� ���Ŀ� ����ȴ�.
	//����Ʈ�ڵ尡 �ε��� ���Ŀ� ���� ���� �ϰ������ ���
	//����Ʈ�ε��� 1�����ϱ⋚���� ��1���� ó���� ���´�.
	
	//�ܼ�Ŭ���� �ܺο��� ������ �ʰڴ�. ���ο����� ���ϰڴ� �Ҷ� private�� ����.
	private  static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	} //�Ⱥ��̴ϱ� ���ٲ�.
	
	public static String inStr(String msg) {
		Console.inMsg(msg); //ȣ��
		return sc.nextLine().trim(); //�̷� �ڵ������ chaining
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	//�˸��޼����� �˷��ִ� �޼ҵ�
	public static void info(String msg) {
		System.out.println(msg);
	}
	//�����޼��� ���
	public static void err(String msg) {
		System.out.println("ERROR]" + msg);
	} //err���༭ �޽��� �߰��ϴ°� wrapping
}
//trim()�� ���: �Է°�(����)���� ������ ����������.
//Console�� utilityŬ������. inMsg�� utility�޼ҵ��.