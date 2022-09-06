package ch04.home.ex05;

public class H01Gugudan {
	public static void main(String[] args){
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++)
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			System.out.println();
		}
		
		
		
		/*
		for(int a = 1; a <= 9; a++ )
		for(int i = 1; i <= 9; i++ ) 
			System.out.printf("%d * %d = %d\n", a, i, a*i );
		*/
		
			
		/*	
		for(int i = 1; i <= 9; i++ ) 
		System.out.printf("2 * %d = %d\n", i, 2*i );
			
		System.out.println();
		
		for(int i = 1; i <= 9; i++ ) 
		System.out.printf("3 * %d = %d\n", i, 3*i );
		*/
	}
}

/* 과제] // 힌트 = overflow
 * 구구단 출력
 * 2 * 1 = 2
 * 2 * 2 = 4
 * ...
 * 2 * 9 = 18
 * 
 * 3 * 1 = 3
 * 3 * 2 = 6
 * ...
 * 
 * 9 * 9 = 81
 */
