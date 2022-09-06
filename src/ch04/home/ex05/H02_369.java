package ch04.home.ex05;

public class H02_369 {
	public static void main(String[] args) {
	
		int tens = 0;
		int ones = 0;
		
		for(int i = 1; i <= 99; i++) {
			tens = i / 10;
			ones = i % 10;
			
			System.out.print(" " + i);
			if(tens != 0 && tens % 3 == 0) System.out.print("Â¦");
			if(ones != 0 && ones % 3 == 0) System.out.print("Â¦");
			
			if(i % 10 == 0) System.out.println();
			
		}
		
		
	/*
		for(int i = 0; i < 100; i+=10) { 
			System.out.println(); 
			for(int j = 1; j <= 10; j++) { 
				if(0 < i && i % 3 == 0 )System.out.print("Â¦");
				if(0 < j && j % 3 == 0) System.out.print("Â¦");
				System.out.print(i+j+" ");
			}          // i != 0 && , j != 0 ÇÏ¸éµÉµí? ¾ÈµÅ³× ¤»
	*/		
		
	}
}

/* °úÁ¦ 369
 * ¼ýÀÚ 1 ÀÌ»ó 99 ÀÌÇÏ
 * 10 ´ÜÀ§ ÁÙ¹Ù²Þ
 * 
 * 1 2 3Â¦ 4 5 6Â¦ ~ 9Â¦ 10
 * 11 12 13Â¦ ~ 19Â¦ 20
 * 21 ~ 29Â¦ 30
 * 91Â¦ 92Â¦ 93Â¦Â¦ ~99Â¦Â¦ 
 */

