package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		/*	과제]
		 * 	앱과 가위바위보를 하라.
		 * 	게임 결과를 알려준다.
		 * 	결과는 You win. You lose. Fair 중의 하나이다.
		 * 	--
		 * 	1. 가위, 2. 바위, 3.보
		 * 	> 1
		 * 	You: 가위
		 * 	Me: 보
		 * 
		 * 	You win.
		 */
		
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.println("1. 가위, 2. 바위, 3. 보\n> ");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			
			switch(playerChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			
			System.out.println("You " + choice);
			
			switch(appChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
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
			result = "ERROR] 1 ~ 3 중, 한 개의 숫자를 입력하세요.";
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
		
		System.out.print("1. 가위, 2. 바위, 3.보\n>");
		choice = sc.nextInt();
		
		if(choice == 1) me = "가위";
		else if(choice == 2) me = "바위";
		else if(choice == 3) me = "보";
		else me = "재입력하세요.";
		System.out.println("You: " + me);
		
		if ( 0 < choice && choice <= 3) {
			if(random <= 3) com = "가위";
		else if(random <= 6) com = "바위";
		else if(random <= 10) com = "보";
		System.out.println("Me: " + com);
		}

		if(me == "가위") {
			switch(com) {
			case "보": result = "You Win"; break;
			case "바위": result = "You Lose"; break;
			case "가위": result = "Fair";
			}
		}else if(me == "바위") {
			switch(com) {
			case "가위": result = "You Win"; break;
			case "보": result = "You Lose"; break;
			case "바위": result = "Fair";
			}
		}else if(me == "보") {
			switch(com) {
			case "바위": result = "You Win"; break;
			case "가위": result = "You Lose"; break;
			case "보": result = "Fair";
			}
			
			System.out.println(result);
		} 
		*/
		
		
		/* int random = (int)(Math.random()*10) + 1;
		int choice = 0;
		String me = "";
		String com = ""; 
		String result = "";
		
		System.out.print("1. 가위, 2.바위, 3.보\n>"); 
		choice = sc.nextInt();
		
		if (choice == 1) me = "가위";
		else if (choice == 2) me = "바위";
		else if (choice == 3) me = "보";
		else me = "다시 입력하세요.";
		System.out.println("You: " + me);
		
		if ( 1 <= choice && choice <= 3 ) {
		if (0 < random && random <= 3) com = "가위"; 
		else if (3 < random && random <= 6) com = "바위"; 
		else if (6 < random && random <= 10) com = "보";
		System.out.println("Me: " + com);
		}
		
		if (me.equals("가위")  && com.equals("보")) result = "You Win";
		else if (me.equals("가위")  && com.equals("바위")) result = "You Lose";
		if (me.equals("가위")  && com.equals("가위")) result = "Fair";
			
		if (me.equals("바위")  && com.equals("가위")) result = "You Win";
		else if (me.equals("바위")  && com.equals("보")) result = "You Lose";
		if (me.equals("바위")  && com.equals("바위")) result = "Fair";
		
		if (me.equals("보")  && com.equals("바위")) result = "You Win";
		else if (me.equals("보")  && com.equals("가위")) result = "You Lose";
		if (me.equals("보")  && com.equals("보")) result = "Fair";
		
		System.out.println("\n" + result); */
	}
}
