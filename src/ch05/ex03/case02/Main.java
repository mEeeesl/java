package ch05.ex03.case02;

public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv ();	//������� - String color
		Tv tv2 = new Tv ();
		System.out.printf("%s\n%s\n",tv1 ,tv2);	//�ּҰ� ���� ����
		System.out.printf("%s\n%s\n\n",tv1.getColor() ,tv2.getColor());
		
		tv1.setColor("Beige");
		System.out.printf("tv1: %s\ntv2: %s\n",tv1.getColor() ,tv2.getColor());
		
		tv2 = tv1; //tv2�� �ּҴ� garbage�ǰ�, garbage collector�� ���ֹ���.
		System.out.printf("tv1: %s\ntv2: %s\n",tv1.getColor() ,tv2.getColor());
		
		tv1.setColor("White");
		System.out.printf("tv1: %s\ntv2: %s\n",tv1.getColor() ,tv2.getColor());
		
		tv2.setColor("Black");
		System.out.printf("tv1: %s\ntv2: %s\n",tv1.getColor() ,tv2.getColor());
	}
}
