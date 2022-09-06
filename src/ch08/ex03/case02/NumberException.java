package ch08.ex03.case02;

public class NumberException extends RuntimeException {
	public NumberException(String msg) {
		super(msg);
	}
}
/*
Exception 보다 RuntimeException을 써라 - try 안써도됨


*/