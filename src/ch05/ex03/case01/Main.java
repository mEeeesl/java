package ch05.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Tv myTv = new Tv();	//객체가 생성될때 heap에 생기는 변수는 자동 초기화
		
		System.out.println(myTv);
		
		System.out.printf("%s, %b, %d\n",
				myTv.getColor(), myTv.isPower(), myTv.getChanner());
		
		myTv.setColor("Red");
		myTv.setPower(true);
		myTv.setChanner(7);
		
		System.out.printf("%s, %b, %d\n",
				myTv.getColor(), myTv.isPower(), myTv.getChanner());
	}
}
