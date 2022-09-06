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
		System.out.println(d);	//	1.0	- (����) x (��Ʈ1) = 1.0
		
		d = (double)a / b;		
		System.out.println(d);	//	1.5 - ����3.0 / ��Ʈ2 = ����3.0/����2.0 = 1.5
		
		
		d = 1.0 * a / b;		
		System.out.println(d);	//  1.5 - 3.0 / ��Ʈ2 = ����3.0 / ����2.0 = 1.5
		
		d = a / b * 1.0;
		System.out.println(d);  //  1.0 - ��Ʈ3 / ��Ʈ2 = ��Ʈ1 * 1.0 = ���� 1.0
		// = 1.0 why? overflow 
		// 1.5�ε� �ϴ� byte�� int�� �Ǽ� ������ 1�� ���� �� 1�� d�� ���� = 1
		// date type�� double�� ��������, 1.0���� ����
		
		/* int ���� ũ�Ⱑ ���� Ÿ���� int�� ��ȯ�Ѵ� - ���׿������� Ư¡
		   ( byte, char, short -> int )
		   
		   �ǿ����� �� ǥ�������� ū Ÿ������ ����ȯ �Ѵ�.
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