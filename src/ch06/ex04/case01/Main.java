package ch06.ex04.case01;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("¾ß¿ËÀÌ", 1);
		
		System.out.println(cat.getName() + ", " + cat.getAge());
						//Animall ºÎ¸ð¸â¹ö»ó¼Ó		 Cat ÀÚ±â²¨ age
		
		cat = new Cat(null, 0);
		System.out.println(cat.getName() + ", " + cat.getAge());
	}
}
