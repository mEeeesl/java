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
// generic type���� ��ƶ� = �ƹ��ų� ��ƶ� ( ������ ����� �ӵ� )
// < > = Diamind
// E = ���ڴ� �ƹ��ų� ���Ƿ� �����ص��� �׷��� E ������ 