package ch08.ex02.case001;

public class Main {
	public static void main(String[] args) {
		Way way = Way.LEFT; // way = WayŸ���� ��ü�� �����
		String direction = ""; // way���� ���ڷ� �ٲ�
		
		if(way == Way.LEFT) direction = "����";
		else direction = "������";
		
		System.out.println(direction);
	}
}
