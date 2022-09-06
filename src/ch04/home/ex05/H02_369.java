package ch04.home.ex05;

public class H02_369 {
	public static void main(String[] args) {
	
		int tens = 0;
		int ones = 0;
		
		for(int i = 1; i <= 99; i++) {
			tens = i / 10;
			ones = i % 10;
			
			System.out.print(" " + i);
			if(tens != 0 && tens % 3 == 0) System.out.print("¦");
			if(ones != 0 && ones % 3 == 0) System.out.print("¦");
			
			if(i % 10 == 0) System.out.println();
			
		}
		
		
	/*
		for(int i = 0; i < 100; i+=10) { 
			System.out.println(); 
			for(int j = 1; j <= 10; j++) { 
				if(0 < i && i % 3 == 0 )System.out.print("¦");
				if(0 < j && j % 3 == 0) System.out.print("¦");
				System.out.print(i+j+" ");
			}          // i != 0 && , j != 0 �ϸ�ɵ�? �ȵų� ��
	*/		
		
	}
}

/* ���� 369
 * ���� 1 �̻� 99 ����
 * 10 ���� �ٹٲ�
 * 
 * 1 2 3¦ 4 5 6¦ ~ 9¦ 10
 * 11 12 13¦ ~ 19¦ 20
 * 21 ~ 29¦ 30
 * 91¦ 92¦ 93¦¦ ~99¦¦ 
 */

