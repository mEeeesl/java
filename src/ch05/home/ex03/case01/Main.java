package ch05.home.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setColor("Black");	
		cat.setName("야코미");
	}
}
/* 
 * 1. 요구사항을 단순화
 * 
 * cat(객체) 
 * name(멤버변수, 객체속성값), color(멤버변수, 객체속성값) 
 * 1마리 
 * 
 * new 로 cat 객체 한 번 만들었으니까 1마리 만든거임
 * String color = black
 * String name = 야코미
 * 입출력 없음.
 * 검은 고양이 한마리를 주웠습니다.
 * 야코미라고 이름을 지어줬습니다.
 */
