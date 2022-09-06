package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 4);
		result = calculator.add(1, 2, 3);
		// calculator.add(1, 4.0); error
		System.out.println(result);
	}
}
