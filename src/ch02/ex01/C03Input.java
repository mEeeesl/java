package ch02.ex01;

import java.util.Scanner;//��Ʈ�� Ŭ������ lang���Ͽ� �ִ� �⺻����������, ��ĳ�ʴ� �ƴ϶� ���� �������.?

public class C03Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String str = sc.nextLine();
		//����] <�Էµ�����>�� �Է��߽��ϴ�.
		System.out.printf("<%s>��(��) �Է��߽��ϴ�.", str);
		
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int I = sc.nextInt();
		System.out.println(I + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		String II = sc.nextLine(); 
		System.out.println(II + "�� �Է��߽��ϴ�.");
		
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String str = sc.nextLine();
		System.out.printf("<%s>�� �Է��߽��ϴ�.", str);
		*/
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
	}

}
