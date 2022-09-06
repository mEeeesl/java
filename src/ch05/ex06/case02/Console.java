package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	//static ���
	//����Ʈ�ڵ尡 �ε��� ���� ���� 1ȸ�� �����
	//����Ʈ�ڵ尡 �ε��� ���� �ϰ������ ������ �̷����Ϸ�
	static { 
		sc = new Scanner(System.in);
	}
	
	//�ܺο��� ���� private static // Ŭ���� ���ο����� ����Ϸ��� �Ʒ�ó��Ȱ���
	private static void inMsg(String msg){
		System.out.print(msg + "\n> ");
	}
	
	//�ܺο��� ������
	public static String inStr(String msg) {
		Console.inMsg(msg);
		return sc.nextLine().trim();//trim() - �����̽� ���� ��������?/ chainning a.a.a
	}
	
	//���� �Է� �޴¹�
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	//�˸��޽���
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	//�����޽���
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}	//wrapping �Ѵٰ� �Ѵ�
}
