package ch05.home.ex01.case01;

public class Main {
	public static void main(String[] args) {
// Flower Class 의 멤버변수(객체의 속성)는 String name;, int petalLength;, int cupLength; 3개만듬 
		
		Flower flower1 = new Flower();
		flower1.name = "창포꽃";
		flower1.petalLength = 7;
		flower1.sepalLength = 2;
		
		Flower flower2 = new Flower();
		flower2.name = "코스모스";
		flower2.petalLength = 4;
		flower2.sepalLength = 1;

		// 꽃 선물할 때는 String flowerName; String ReceiverName();
	}
} 
/*
 * 창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm 입니다.
 * 코스모스는 꽃잎 길이가 4cm, 꽃받침 길이가 1cm 입니다.
 * 출력은 안해도됨
 * 
 * 0. 객체를 추상화한 단어로 클래스명 명명 	>	"Flower flower = new Flower();" 
 * 1. 창포꽃 / 코스모스					>	String type - "name"; 
 * 2. 꽃잎길이 						>	int - petalLength; 
 * 3. 꽃받침길이						>	int - sepalLength; 
 */