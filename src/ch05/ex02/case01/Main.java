package ch05.ex02.case01;
								// box의 객체는 domain이라고도함 - data를 담는다 - domain
public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setA(1);
		box.setB(2);
		
		int result = box.getA() + box.getB();
		result = box.getA() - box.getB();
		
		System.out.println(result);
	}
}
