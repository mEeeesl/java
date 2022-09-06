package ch05.ex03.case02;

public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv ();	//멤버변수 - String color
		Tv tv2 = new Tv ();
		System.out.printf("%s\n%s\n",tv1 ,tv2);	//주소값 서로 상이
		System.out.printf("%s\n%s\n\n",tv1.getColor() ,tv2.getColor());
		
		tv1.setColor("Beige");
		System.out.printf("tv1: %s\ntv2: %s\n",tv1.getColor() ,tv2.getColor());
		
		tv2 = tv1; //tv2의 주소는 garbage되고, garbage collector가 없애버림.
		System.out.printf("tv1: %s\ntv2: %s\n",tv1.getColor() ,tv2.getColor());
		
		tv1.setColor("White");
		System.out.printf("tv1: %s\ntv2: %s\n",tv1.getColor() ,tv2.getColor());
		
		tv2.setColor("Black");
		System.out.printf("tv1: %s\ntv2: %s\n",tv1.getColor() ,tv2.getColor());
	}
}
