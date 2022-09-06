package ch05.ex05.case09;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("늠름이");
		
		Cat cat2 = cat.breed(); // 늠름이가 낳은 아기고양이
		cat2.setName("튼튼이");
		
		System.out.println(cat.getName() + " " + cat2.getName());
	}
}
