package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int grade = 0;
		String coupon = "";
		
		switch(3) {
		case 3: coupon += "10,000�� "; break;
		case 2: coupon += "5,000�� "; break;
		case 1: coupon += "1,000�� "; 
		}
		
		System.out.println(coupon);
	}
}
