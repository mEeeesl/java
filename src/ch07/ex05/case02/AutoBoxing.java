package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		int a1 = 1;
		Integer a2 = new Integer(1);  	//��ü�� ����¹�
		int a3 = new Integer(1);	
		//promotion�� �ƴϴ�. Ÿ���� �ٸ� int�� ��ü
		//AutoUnBoxing
		
		Integer a4 = 1;	
		//1 = Boxing => Literal(int 1)�� Integer Ÿ������ ��ȯ�� = AutoBoxing
		
		boolean b1 = true;
		Boolean b2 = new Boolean(true);
		boolean b3 = new Boolean(true); // unBoxing
		Boolean b4 = true; 				// AutoBoxing�Ǽ� ��ü���Ǽ� b4�� ���
		
	}
}
/* AutoBoxing
 * 
 */
