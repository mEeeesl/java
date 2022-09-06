package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	//static ���
	//����Ʈ�ڵ尡 �ε��� ���� �����
	//����Ʈ�ڵ尡 �ε��� ���� �ϰ������ ������ �̷����Ϸ�
	static { 
		sc = new Scanner(System.in);
	}
	
	//�ܺο��� ���� private static
	private static void inMsg(String msg){
		System.out.print(msg + "\n> ");
	}
	
	//�ܺο��� ������
	public static String inStr(String msg) {
		String inPut = null;
		boolean isRun = false;
		do {
			Console.inMsg(msg);
			inPut = sc.nextLine().trim();
			if(inPut.length() > 0) isRun = true;
			else Console.err("�ѱ��� �̻� �Է��ϼ���.");
		} while(!isRun);
		return inPut;//trim() - ������ �����ش�./ chainning a.a.a
	}
	
	//���� �Է� �޴¹�
	public static int inNum(String msg) {
		int num = 0;
		String numStr = null;
		boolean isRun = false;
		do {
			Console.inMsg(msg);
			numStr = sc.nextLine().trim();
			if (numStr.length() == 1 && 
					'0' < numStr.charAt(0) && numStr.charAt(0) <= '9') {
				isRun = true;
				num = Integer.parseInt(numStr);
			}
			else Console.err("���ڸ� �ڿ����� �Է��ϼ���");
		} while (!isRun);		
		return num;
	}
	
	//�˸��޽���
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	//�����޽���
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
