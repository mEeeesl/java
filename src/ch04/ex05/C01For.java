package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		/*	int i = 0;
		    while(i < 10) {
			System.out.println(i + " ");
			i++;
			}
			> 1 2 3 4 5 6 7 8 9 
		*/
			//�ʱⰪ ;   true��; ���� ;
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " / ");
		}
		System.out.println();
		
		// ����] i=1�� ��Ȳ����, 0 �̻� 9���ϸ� ����϶�.
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(i - 1 + " , ");
		}
		System.out.println();
		
		
	}
}


