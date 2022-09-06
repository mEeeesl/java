package ch07.ex05.case01;

//generic type
public class Basket<E> {
	private E e;
	
	public E get() {
		return this.e;
	}
	public void set(E e) {
		this.e = e;
	}
}
// generic type으로 담아라 = 아무거나 담아라 ( 포도든 사과든 머든 )
// < > = Diamind
// E = 글자는 아무거나 임의로 선택해도됨 그래서 E 적은듯 