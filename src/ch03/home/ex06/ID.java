
package ch03.home.ex06;

import java.util.Scanner;

public class ID {
	public static void main(String[] args) {
		/* ����
		   �ֹε�Ϲ�ȣ�� �Է��Ѵ�.
		   ���ฦ �Ǵ��ؼ� ����Ѵ�.	 
		
		   �ֹε�Ϲ�ȣ: 201514-1230452
		   �����Դϴ�. (�����Դϴ�.)
		*/

	Scanner sc = new Scanner(System.in);
	boolean isRun = false;
	String num = "";
	String point = "";
	String ans = ""; 
		
		do {
			System.out.print("�ֹε�Ϲ�ȣ: ");
			num = sc.nextLine();
			
			point = num.substring(7, 8);
	
			if(point.length() == 1 && '1' <= point.charAt(0) && point.charAt(0) <= '2') {
				isRun = true;
				switch(point) {
				case "1": ans = "�����Դϴ�."; break;
				case "2": ans = "�����Դϴ�.";
				}
			} else ans = "�ٽ� �Է����ּ���.";
		} while(!isRun);
		
		/* 
		if (point.equals("1")) ans = "�����Դϴ�.";
		else if (point.equals("2")) ans = "�����Դϴ�.";
		else ans = "�ٽ� �Է����ּ���."; 
		*/
		
		System.out.println(ans);
		
		/* 
		ans = point.equals("1") ? "�����Դϴ�." : point.equals("2") ? "�����Դϴ�." : "�ٽ� �Է����ּ���.";
		System.out.println(ans);
		*/
		
	}
}		