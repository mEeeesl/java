package ch05.ex02.case01;
							//box의 객체는 domain 이라고도함 - data를 담는다
public class Box {
	private int a;
	private int b;
			// 	▼ 메서드선언부
	public int getA() {	// 메서드블록
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
