package ch05.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Tv myTv = new Tv();	//��ü�� �����ɶ� heap�� ����� ������ �ڵ� �ʱ�ȭ
		
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
