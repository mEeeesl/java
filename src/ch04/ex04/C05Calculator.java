package ch04.ex04;
		
import java.util.Scanner;
								// ���� > ��Ʈ�� 	== 	toString(), ���� + "";
								// String > int ==	Integer.parseInt("����"); 
								//.equalsIgnoreCase("") -> ��/�ҹ��� ���о�����
public class C05Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int a = 0;
		int b = 0;
		String aStr = "";
		String bStr = "";
		String op = "";
		boolean isGood = false;
		int result = 0;
		String isRepeat = "";
		
		// ���� -> ��Ʈ�� =  1> toString , 2> ���� + ""; 
		// ��Ʈ�� -> ���� =  a = Integer.parseInt("");
		// Toggle ������ �տ� is�� �ٿ����°� ���� ( isTrue isFalse )
		// Toggle ������ boolean Ÿ�� 
		 
		do {
			do {
				System.out.print("a: ");
				aStr = sc.nextLine();
				//if(&& aStr.matches("[0-9]*")
				if(aStr.length() == 1 && '0' < aStr.charAt(0) && aStr.charAt(0) <= '9') {
					isGood = true;
					a = Integer.parseInt(aStr);
				} else System.out.println("Error] 10 �̸��� �ڿ����� �Է��ϼ���.");	
			} while(!isGood); 
			// while(!(isGood = true))
			// while(isGood != true)
			// while(!isGood)
			
			do {
				isGood = false;
				System.out.print("op: ");
				op = sc.nextLine();
				if(op.length() == 1 && 
					(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))){
					isGood = true;
				} else System.out.println("Error] +, -, *, / ���� �ϳ��� �Է��ϼ���");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: ");
				bStr = sc.nextLine();
				if(bStr.length() == 1 && bStr.matches("[0-9]*")) {
					isGood = true;
					b = Integer.parseInt(bStr);
				} else System.out.println("Error] 10 �̸��� �ڿ����� �Է��ϼ���.");	
			} while(!isGood);
			
			switch(op) {
			case "+": result = a + b; break;
			case "-": result = a - b; break;
			case "*": result = a * b; break;
			case "/": result = a / b; 
			}
			
			System.out.printf("%d %s %d = %d\n", a , op, b, result);
			
			do {
				isGood = false;
				System.out.print("����ұ��(y/n)? ");
				isRepeat = sc.nextLine();
				if(isRepeat.length() == 1 && 
					(isRepeat.equalsIgnoreCase("y") || isRepeat.equalsIgnoreCase("n"))) {
					isGood = true;
				} else System.out.println("Error] yȤ�� n�� �Է��ϼ���");
			} while(!isGood);
		} while ( isRepeat.equalsIgnoreCase("y"));
		//.equalsIgnoreCase("") -> ��/�ҹ��� ���о�����
		System.out.println("��.");
	}
}