package ch08.ex02.case001;

public class Main {
	public static void main(String[] args) {
		Way way = Way.LEFT; // way = Way타입의 객체가 저장됨
		String direction = ""; // way값을 문자로 바꿈
		
		if(way == Way.LEFT) direction = "왼쪽";
		else direction = "오른쪽";
		
		System.out.println(direction);
	}
}
