package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		//promotion
		B b = c;
		A a = c;
		
		//Casting
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
		a = (A)b;
		//String s = (String)c; - Error - C에는 String 타입이 없음
	}
}

/*			double d = int i;
 *			int i  = (int)double d;
 *	
 *  대장  A, B
 *  쫄따구  C 
 *  
 *  작은 타입이 큰 타입으로 변함 - promotion 됨
 *  
 *  new() 객체 하나를 여러 타입으로 놀아본거임
 *  
 *  해당 객체가 갖고있는 타입내에서 casting이 가능함
 *  나는 아들타입이고 학생타입이고 남자타입임 
 *	 
 */