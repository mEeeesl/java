package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		byte c = (byte)(a + b);
		int i = a + b;
		
		System.out.println(c);
		System.out.println(i);
		
		// c = c + 1;
		c++;
		System.out.println(c);
		
		int d2 = a / b;			
		System.out.println(d2); //	1
		
		double d = a / b;	
		System.out.println(d);  //	1.0
		
		d = (double)(a / b);
		System.out.println(d);	//	1.0	- (더블) x (인트1) = 1.0
		
		d = (double)a / b;		
		System.out.println(d);	//	1.5 - 더블3.0 / 인트2 = 더블3.0/더블2.0 = 1.5
		
		
		d = 1.0 * a / b;		
		System.out.println(d);	//  1.5 - 3.0 / 인트2 = 더블3.0 / 더블2.0 = 1.5
		
		d = a / b * 1.0;
		System.out.println(d);  //  1.0 - 인트3 / 인트2 = 인트1 * 1.0 = 더블 1.0
		// = 1.0 why? overflow 
		// 1.5인데 일단 byte가 int로 되서 정수인 1만 남음 그 1을 d로 대입 = 1
		// date type이 double로 되있으니, 1.0으로 나옴
		
		/* int 보다 크기가 작은 타입은 int로 변환한다 - 이항연산자의 특징
		   ( byte, char, short -> int )
		   
		   피연사자 중 표현범위가 큰 타입으로 형변환 한다.
		   byte  +  byte  ->  int   +   int   ->   int
		   byte  + short  ->  int   +   int   ->   int
		   char  +  int   ->  int   +   int   ->   int 
		   float +  int   -> float  +  float  ->  float
		   long  + float  -> float  +  float  ->  float
		   float + double -> double +  double ->  double      
		   
		   int 32bit 4byte  < float 4byte
		   long 64bit 8byte < float	1+8+23=32 bit				  */
		
		
		
	}
}