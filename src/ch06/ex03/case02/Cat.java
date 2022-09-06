package ch06.ex03.case02;

public class Cat extends Animal{
	@Override 	
	public void shout() {
		System.out.println("야옹야옹");
	}
}

/*
annotation(주석) - compiler가 읽을 주석 
지금까지 써온건 Comment(주석) - 개발자가 읽을 주석
몸체를 덮어쓰는거기에,
선언문(틀)은 똑같이 적어야함 public void shout(){} 
*/