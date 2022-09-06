package ch04.ex04;
		
import java.util.Scanner;
								// 숫자 > 스트링 	== 	toString(), 숫자 + "";
								// String > int ==	Integer.parseInt("변수"); 
								//.equalsIgnoreCase("") -> 대/소문자 구분없애줌
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
		
		// 숫자 -> 스트링 =  1> toString , 2> 숫자 + ""; 
		// 스트링 -> 숫자 =  a = Integer.parseInt("");
		// Toggle 변수는 앞에 is를 붙여쓰는게 관례 ( isTrue isFalse )
		// Toggle 변수는 boolean 타입 
		 
		do {
			do {
				System.out.print("a: ");
				aStr = sc.nextLine();
				//if(&& aStr.matches("[0-9]*")
				if(aStr.length() == 1 && '0' < aStr.charAt(0) && aStr.charAt(0) <= '9') {
					isGood = true;
					a = Integer.parseInt(aStr);
				} else System.out.println("Error] 10 미만의 자연수를 입력하세요.");	
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
				} else System.out.println("Error] +, -, *, / 중의 하나를 입력하세요");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: ");
				bStr = sc.nextLine();
				if(bStr.length() == 1 && bStr.matches("[0-9]*")) {
					isGood = true;
					b = Integer.parseInt(bStr);
				} else System.out.println("Error] 10 미만의 자연수를 입력하세요.");	
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
				System.out.print("계속할까요(y/n)? ");
				isRepeat = sc.nextLine();
				if(isRepeat.length() == 1 && 
					(isRepeat.equalsIgnoreCase("y") || isRepeat.equalsIgnoreCase("n"))) {
					isGood = true;
				} else System.out.println("Error] y혹은 n을 입력하세요");
			} while(!isGood);
		} while ( isRepeat.equalsIgnoreCase("y"));
		//.equalsIgnoreCase("") -> 대/소문자 구분없애줌
		System.out.println("끝.");
	}
}