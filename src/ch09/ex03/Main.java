package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();
		new Player(counter).start(); // 2���̼� counter �����ؼ� �����ϱ�. (����)
		new Player(counter).start(); // 3���̼� counter �����ؼ� �����ϱ�. (����)
		
	}
}
/*
�ϳ� �����ؼ� ���� �����ѵ�.
�̰� �����ϴ� ����� => QUE (�ټ��� - FIFOó��) 
synchronized - �޼ҵ带 ȣ���ϸ� �� �ɱ� - ���� ȣ���� ���� �� �ɾ����




*/