package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		/*	����]
		 * 	�۰� ������������ �϶�.
		 * 	���� ����� �˷��ش�.
		 * 	����� You win. You lose. Fair ���� �ϳ��̴�.
		 * 	--
		 * 	1. ����, 2. ����, 3.��
		 * 	> 1
		 * 	You: ����
		 * 	Me: ��
		 * 
		 * 	You win.
		 */
		
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.println("1. ����, 2. ����, 3. ��\n> ");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			
			switch(playerChoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			
			System.out.println("You " + choice);
			
			switch(appChoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			
			System.out.println("me " + choice);
			
			switch(playerChoice - appChoice) {
			case -2: case 1: 
				result = "You Win."; break;
			case -1, 2: 
				result = "You Lose."; break;
			case 0:
				result = "Fair";
			}
			
		} else {
			result = "ERROR] 1 ~ 3 ��, �� ���� ���ڸ� �Է��ϼ���.";
		}
		
		System.out.println(result);
		
		/* if() { 
		switch () {
		case -2 ,1: result = "you Win"; break; 
		case -1, 2: result = "you Lose";break;
		case 0: result = "Fair";
		} 
		} */
		
		
		
		
		
		
		/*
		int choice = 0;
		int random = (int)(Math.random() * 10) + 1;
		String me = "";
		String com = "";
		String result = "";
		
		System.out.print("1. ����, 2. ����, 3.��\n>");
		choice = sc.nextInt();
		
		if(choice == 1) me = "����";
		else if(choice == 2) me = "����";
		else if(choice == 3) me = "��";
		else me = "���Է��ϼ���.";
		System.out.println("You: " + me);
		
		if ( 0 < choice && choice <= 3) {
			if(random <= 3) com = "����";
		else if(random <= 6) com = "����";
		else if(random <= 10) com = "��";
		System.out.println("Me: " + com);
		}

		if(me == "����") {
			switch(com) {
			case "��": result = "You Win"; break;
			case "����": result = "You Lose"; break;
			case "����": result = "Fair";
			}
		}else if(me == "����") {
			switch(com) {
			case "����": result = "You Win"; break;
			case "��": result = "You Lose"; break;
			case "����": result = "Fair";
			}
		}else if(me == "��") {
			switch(com) {
			case "����": result = "You Win"; break;
			case "����": result = "You Lose"; break;
			case "��": result = "Fair";
			}
			
			System.out.println(result);
		} 
		*/
		
		
		/* int random = (int)(Math.random()*10) + 1;
		int choice = 0;
		String me = "";
		String com = ""; 
		String result = "";
		
		System.out.print("1. ����, 2.����, 3.��\n>"); 
		choice = sc.nextInt();
		
		if (choice == 1) me = "����";
		else if (choice == 2) me = "����";
		else if (choice == 3) me = "��";
		else me = "�ٽ� �Է��ϼ���.";
		System.out.println("You: " + me);
		
		if ( 1 <= choice && choice <= 3 ) {
		if (0 < random && random <= 3) com = "����"; 
		else if (3 < random && random <= 6) com = "����"; 
		else if (6 < random && random <= 10) com = "��";
		System.out.println("Me: " + com);
		}
		
		if (me.equals("����")  && com.equals("��")) result = "You Win";
		else if (me.equals("����")  && com.equals("����")) result = "You Lose";
		if (me.equals("����")  && com.equals("����")) result = "Fair";
			
		if (me.equals("����")  && com.equals("����")) result = "You Win";
		else if (me.equals("����")  && com.equals("��")) result = "You Lose";
		if (me.equals("����")  && com.equals("����")) result = "Fair";
		
		if (me.equals("��")  && com.equals("����")) result = "You Win";
		else if (me.equals("��")  && com.equals("����")) result = "You Lose";
		if (me.equals("��")  && com.equals("��")) result = "Fair";
		
		System.out.println("\n" + result); */
	}
}
