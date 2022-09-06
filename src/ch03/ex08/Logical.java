package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		
		b = true && true;		//true
		b = (2 > 1) && (2 >= 1);//true 
		b = 2 < 1 && 2 > 1;		//false
		
		b = true || false;		//true
		b = 2 < 1 || 2 > 1;		//true
		b = 2 < 1 || 2 < 1;		//false
		System.out.println(b);		
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;
		
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);	// x: 1 y: 0 d: false
		// ++x < 0 > 여기서 이미 false가 나왔기에, ++y는 계산을 안해버리기에 y=0 이다.
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0;	
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);	// x: 1 y: 1 d: false
		// &는 false가 나왔더라도 계산을 하긴 함
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);	// x: 1 y: 1 d: false
		// || => 앞이 F여도 뒤에 T or F 여부 파악을 위해 계산을 해줌 => y = 1 
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);	// x: 1 y: 0 d: True
		// 앞에 이미 True여서, y까지는 계산 안함 => y = 0
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);	// x: 1 y: 1 d: True
		// |, &는 True던 False던 일단 계산은 다 하고 넘어감 => y = 1 
	}
}
