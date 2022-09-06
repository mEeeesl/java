package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		int a1 = 1;
		Integer a2 = new Integer(1);  	//객체로 만드는법
		int a3 = new Integer(1);	
		//promotion은 아니다. 타입이 다름 int와 객체
		//AutoUnBoxing
		
		Integer a4 = 1;	
		//1 = Boxing => Literal(int 1)이 Integer 타입으로 변환됨 = AutoBoxing
		
		boolean b1 = true;
		Boolean b2 = new Boolean(true);
		boolean b3 = new Boolean(true); // unBoxing
		Boolean b4 = true; 				// AutoBoxing되서 객체가되서 b4에 담김
		
	}
}
/* AutoBoxing
 * 
 */
